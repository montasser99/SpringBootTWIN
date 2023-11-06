package com.example.debutwork.Service;

import com.example.debutwork.entity.Reservation;

import java.util.List;

public interface ReservationServiceImpl {
    Reservation addReservation(Reservation reservation);
    List<Reservation> getAllReservations();
    Reservation updateReservation(Reservation reservation, String id);
    void deleteReservation(String id);
}
