package com.example.crud_Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud_Hotel.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

}
