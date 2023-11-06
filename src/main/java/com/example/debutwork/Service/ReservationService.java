package com.example.debutwork.Service;

import com.example.debutwork.Repository.EtudiantRepository;
import com.example.debutwork.Repository.ReservationRepository;
import com.example.debutwork.entity.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService implements ReservationServiceImpl {
    @Autowired
    ReservationRepository reservationRepository;


    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation reservation, String id) {
        Optional<Reservation> existingReservationOptional = reservationRepository.findById(id);

        if (existingReservationOptional.isPresent()) {
            Reservation existingReservation = existingReservationOptional.get();

            existingReservation.setEtudiants(reservation.getEtudiants());
            existingReservation.setAnneeUniversitaire(reservation.getAnneeUniversitaire());
            existingReservation.setEstValide(reservation.isEstValide());

            return reservationRepository.save(existingReservation);
        } else {
            return null;
        }
    }

    @Override
    public void deleteReservation(String id) {
        reservationRepository.deleteById(id);

    }
}
