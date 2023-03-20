package com.ssafy.jobtender.controller;

import com.ssafy.jobtender.dto.input.KeywordInputDTO;
import com.ssafy.jobtender.dto.output.UserOutDTO;
import com.ssafy.jobtender.service.InputService;
import com.ssafy.jobtender.service.UserService;
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

    @Autowired
    public UserController(UserService userService, InputService inputService) {
        this.userService = userService;
        this.inputService = inputService;
    }
    
    @PostMapping("/keyword")
    public void createInputsKeyword(@RequestBody KeywordInputDTO keywordInputDTO){
        List<String> userKeyWord = keywordInputDTO.getKeyWords();

    }

    @GetMapping("/info")
    public ResponseEntity<UserOutDTO> readUsersByUserId(@RequestParam("userId") String userId) {
        System.out.println("asdfasdf");
        UserOutDTO userOutDTO = this.userService.readUsersByUserId(Long.parseLong(userId));
        return ResponseEntity.status(HttpStatus.OK).body(userOutDTO);
    }
}

