package com.ssafy.jobtender.controller;

import com.ssafy.jobtender.dto.input.KeywordInputDTO;
import com.ssafy.jobtender.dto.input.UpdateUserDTO;
import com.ssafy.jobtender.dto.output.ReadResultOutDTO;
import com.ssafy.jobtender.dto.output.UserOutDTO;
import com.ssafy.jobtender.entity.Keyword;
import com.ssafy.jobtender.service.InputService;
import com.ssafy.jobtender.service.KeywordService;
import com.ssafy.jobtender.service.ResultService;
import com.ssafy.jobtender.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final InputService inputService;
    private final ResultService resultService;
    private final KeywordService keywordService;

    // 생성자 주입 방식
    @Autowired
    public UserController(UserService userService, InputService inputService,
                          ResultService resultService, KeywordService keywordService) {
        this.userService = userService;
        this.inputService = inputService;
        this.resultService = resultService;
        this.keywordService = keywordService;
    }

    // API - 키워드 선택
    @ApiOperation(
            value = "키워드 선택 API"
            , notes = "유저가 키워드 3가지를 선택한다. 성공 여부를 반환한다.")
    @PostMapping("/keyword")
    public ResponseEntity<Void> createInputsKeyword(@RequestParam("userId") Long userId, @RequestBody KeywordInputDTO keywordInputDTO) {
        List<Long> userKeyWord = keywordInputDTO.getKeyWords();
        if (!userKeyWord.isEmpty()) {
            resultService.createResult(userId);
            inputService.createInputsKeyword(userId, userKeyWord);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
    // API - 전체 키워드 확인
    @ApiOperation(
            value = "전체 키워드 확인 API"
            , notes = "전체 키워드를 반환한다."
            )
    @GetMapping("/keyword")
    public ResponseEntity<List<Keyword>> readAllKeywords(){
        List<Keyword> keywords = keywordService.readAllKeywords();
        return ResponseEntity.status(HttpStatus.OK).body(keywords);
    }

    // API - 회원정보 확인
    @ApiOperation(
            value = "회원 정보 확인 API"
            , notes = "유저의 정보를 반환한다.")
    @GetMapping("/info")
    public ResponseEntity<UserOutDTO> readUsersByUserId(@RequestParam("userId") Long userId) {
        UserOutDTO userOutDTO = this.userService.readUsersByUserId(userId);
        return ResponseEntity.status(HttpStatus.OK).body(userOutDTO);
    }
    
    // API - 회원정보 수정
    @ApiOperation(
            value = "회원 정보 수정 API"
            , notes = "유저의 정보를 수정한다. 수정된 유저 정보를 반환한다.")
    @PutMapping("/info")
    public ResponseEntity<UserOutDTO> updateUserByUserId(@RequestBody UpdateUserDTO updateUserDTO){
        UserOutDTO userOutDTO = this.userService.updateUsersByUserId(updateUserDTO);
        return ResponseEntity.status(HttpStatus.OK).body(userOutDTO);
    }
    
    // API - 회원정보 삭제
    @ApiOperation(
            value = "회원 정보 삭제 API"
            , notes = "유저의 정보를 삭제한다. 삭제 성공 여부를 Boolean으로 반환한다.")
    @DeleteMapping("/info")
    public ResponseEntity<Boolean> deleteUserByUserId(@RequestParam("userId") Long userId){
        return ResponseEntity.status(HttpStatus.OK).body(this.userService.deleteUserByUserId(userId));
    }
    // API - 분석 기록 확인
    @ApiOperation(
            value = "분석 기록 확인 API"
            , notes = "유저의 이전 분석 기록을 반환한다.")
    @GetMapping("/history")
    public ResponseEntity<List<ReadResultOutDTO>> readResultsByUserId(@RequestParam("userId") Long userId){
        List<ReadResultOutDTO> readResultOutDTO = this.resultService.readResultsByUserId(userId);
        return ResponseEntity.status(HttpStatus.OK).body(readResultOutDTO);
    }
}

