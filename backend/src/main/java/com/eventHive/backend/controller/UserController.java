package com.eventHive.backend.controller;

import com.eventHive.backend.model.Users;
import com.eventHive.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/profile")
    public ResponseEntity<Users> getProfile() {
        return ResponseEntity.ok(userService.getCurrentUser());
    }

    @PostMapping("/attend/{eventId}")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<String> attendEvent(@PathVariable Long eventId) {
        userService.attendEvent(eventId);
        return ResponseEntity.ok("Event joined!");
    }
}