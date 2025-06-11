package com.eventHive.backend.service.impl;

import com.eventHive.backend.model.Event;
import com.eventHive.backend.model.Users;
import com.eventHive.backend.repository.EventRepository;
import com.eventHive.backend.repository.UserRepository;
import com.eventHive.backend.service.UserService;
import com.eventHive.backend.util.SecurityUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final EventRepository eventRepository;

    @Override
    public Users getCurrentUser() {
        String username = SecurityUtil.getCurrentUsername();
        return userRepository.findByUsername(username).orElseThrow();
    }

    @Override
    public void attendEvent(Long eventId) {
        Users user = getCurrentUser();
        Event event = eventRepository.findById(eventId).orElseThrow();
        user.getEvents().add(event);
        userRepository.save(user);
    }
}