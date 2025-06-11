package com.eventHive.backend.service;

import com.eventHive.backend.model.Users;

public interface UserService {
    Users getCurrentUser();
    void attendEvent(Long eventId);
}