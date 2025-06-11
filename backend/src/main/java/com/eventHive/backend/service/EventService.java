package com.eventHive.backend.service;

import com.eventHive.backend.model.Event;

import java.util.List;

public interface EventService {
    List<Event> getAllEvents();
    Event createEvent(Event event);
    Event updateEvent(Long id, Event event);
    void deleteEvent(Long id);
}