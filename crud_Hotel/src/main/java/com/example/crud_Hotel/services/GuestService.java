package com.example.crud_Hotel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud_Hotel.model.Guest;
import com.example.crud_Hotel.repository.GuestRepository;

@Service
// Craer, obtener, eliminar y mostrar

public class GuestService {

    // Imjecta de manera resumida nuestro Guest Repository
    @Autowired
    private GuestRepository guestRepository;

    // Método que muestra todos los Guest
    public List<Guest> getAllGuest() {
        return guestRepository.findAll();
    }
     
    // Crear un nuevo Guest
    public Guest createGuest(Guest guest) {
        return guestRepository.save(guest);
    }
    // Actualiza un Guest
    public Guest updateGuest(Guest guest) {
        return guestRepository.save(guest);
    }
    // Elimina un Guest
    public void deleteGuest(Long id) {
        guestRepository.deleteById(id);
    }

}
