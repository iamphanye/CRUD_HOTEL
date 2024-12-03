package com.example.crud_Hotel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud_Hotel.model.Room;
import com.example.crud_Hotel.repository.RoomRepository;

@Service
public class RoomService {

    // Imjecta de manera resumida nuestro Room Repository
    @Autowired
    private RoomRepository roomRepository;

    // Metodo para obtener todos los registros de la tabla Room
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    // Método para crear un nuevo registro en la tabla Room
    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    // Método para actualizar un registro existente en la tabla Room
    public Room updateRoom(Room room) {
        return roomRepository.save(room);
    }
    // Método para eliminar un registro existente en la tabla Room
    public void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }
}
