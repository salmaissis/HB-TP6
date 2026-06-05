package org.example.service;

import org.example.model.Reservation;

import java.util.Optional;

public interface ReservationService {
    org.example.model.Reservation save(Reservation reservation);
    Optional<Reservation> findById(Long id);
    void update(Reservation reservation);
    void delete(Reservation reservation);
}