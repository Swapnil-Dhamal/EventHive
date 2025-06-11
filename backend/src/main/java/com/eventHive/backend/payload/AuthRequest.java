package com.eventHive.backend.payload;

import lombok.Data;

@Data
public class AuthRequest {
    private String username;
    private String password;
}
