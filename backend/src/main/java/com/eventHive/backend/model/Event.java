package com.eventHive.backend.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Event {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String description;
    private LocalDateTime dateTime;
    private String location;

    @ManyToOne
    private Users organizer;

    @ManyToMany(mappedBy = "events")
    private Set<Users> attendees = new HashSet<>();
}
