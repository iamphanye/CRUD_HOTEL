package com.example.crud_Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud_Hotel.model.Reservations;

public interface ReservationRepository extends JpaRepository<Reservations, Long> {

}
