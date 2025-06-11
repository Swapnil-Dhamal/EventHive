package com.eventHive.backend.model;

import com.eventHive.backend.domain.Role;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Users {
    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    // Events user has joined
    @ManyToMany
    private Set<Event> events = new HashSet<>();
}
