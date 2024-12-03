package com.example.crud_Hotel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud_Hotel.model.Reservations;
import com.example.crud_Hotel.repository.ReservationRepository;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    // Método que muestra todos los huespedes
    public List<Reservations> getAllReservations() {
        return reservationRepository.findAll();
    }
    // Crear un nuevo huesped
    public Reservations createReservation(Reservations reservation) {
        return reservationRepository.save(reservation);
    }
    // Actualizar
    public Reservations updateReservation(Reservations reservation) {
        return reservationRepository.save(reservation);
    }
    // Eliminar
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }
}
