package com.example.securityjwt.dtos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

//@RequiredArgsConstructor

@Data
public class JwtRequest {
    private String username;
    private String password;
}
