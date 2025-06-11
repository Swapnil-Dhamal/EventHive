package com.eventHive.backend.service;

import com.eventHive.backend.payload.AuthRequest;
import com.eventHive.backend.payload.AuthResponse;
import com.eventHive.backend.payload.RegisterRequest;

public interface AuthService {
    String register(RegisterRequest request);
    AuthResponse login(AuthRequest request);
}