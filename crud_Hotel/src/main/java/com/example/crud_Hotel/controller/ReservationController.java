package com.example.crud_Hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud_Hotel.model.Reservations;
import com.example.crud_Hotel.services.ReservationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200") 
@RequestMapping("api/reservations")

public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    // Obtener todas las reservaciones
    @GetMapping
    public List<Reservations> getAllReservations() {
        return reservationService.getAllReservations();
    }

    // Crear una nueva reserva
    @PostMapping
    public Reservations createReservation(@RequestBody Reservations reservation) {
        return reservationService.createReservation(reservation);
    }

    // Actualizar una reserva
    @PutMapping
    public Reservations updateReservation(@RequestBody Reservations reservation) {
        return reservationService.updateReservation(reservation);
    }

    // Eliminar una reserva
    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
    }
}
