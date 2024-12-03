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

import com.example.crud_Hotel.model.Room;
import com.example.crud_Hotel.services.RoomService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/rooms")

public class RoomController {

    @Autowired
    private RoomService roomService;

    // Obtener todos los habitaciones
    @GetMapping
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }

    // Crea una nueva habitación
    @PostMapping
    public Room createRoom(@RequestBody Room room) {
        return roomService.createRoom(room);
    }

    // Actualiza una habitación
    @PutMapping
    public Room updateRoom(@RequestBody Room room) {
        return roomService.updateRoom(room);
    }

    // Elimina una habitación
    @DeleteMapping("/{id}")
    public void deleteRoom(@PathVariable Long id) {
        roomService.deleteRoom(id);
    }
}
