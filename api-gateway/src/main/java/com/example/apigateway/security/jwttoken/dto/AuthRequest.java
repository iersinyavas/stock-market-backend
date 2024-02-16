package com.example.apigateway.security.jwttoken.dto;

public record AuthRequest (
        String username,
        String password
){
}
