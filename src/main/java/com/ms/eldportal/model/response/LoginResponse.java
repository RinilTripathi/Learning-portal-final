package com.ms.eldportal.model.response;

import lombok.Data;

import java.util.List;

@Data
public class LoginResponse {
    private String userId;
    private String password;
    private String dept;
    private List<CategoryVo> categoryWiseVideo;


}
