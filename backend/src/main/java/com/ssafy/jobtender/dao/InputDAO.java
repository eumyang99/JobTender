package com.ssafy.jobtender.dao;
import com.ssafy.jobtender.entity.Input;

import java.util.List;

public interface InputDAO {
    void createInputsKeyword(Long userId, long userKeyWord);
    Input readInputsByResultId(long resultId);
}