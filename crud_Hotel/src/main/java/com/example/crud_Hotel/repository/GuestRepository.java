package com.example.crud_Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud_Hotel.model.Guest;

public interface GuestRepository extends JpaRepository<Guest, Long> {

}
