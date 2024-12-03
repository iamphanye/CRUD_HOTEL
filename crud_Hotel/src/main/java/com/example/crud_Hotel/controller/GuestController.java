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

import com.example.crud_Hotel.model.Guest;
import com.example.crud_Hotel.services.GuestService;

// Define el comportamiento de los endpoint y las rutas
@RestController
@CrossOrigin(origins = "http://localhost:4200") // Permite que el frontend haga peticiones al backend
@RequestMapping("api/guests")

public class GuestController {
    // Hacemos una Injección
    @Autowired
    private GuestService guestService;

    // GET
    @GetMapping
    public List<Guest> getAllGuest() {
        return guestService.getAllGuest();
    }

    // POST
    @PostMapping
    public Guest createGuest(@RequestBody Guest guest) {
        return guestService.createGuest(guest);
    }

    // PUT
    @PutMapping("/{id}")
    public Guest updateGuest(@RequestBody Guest guest, @PathVariable Long id) {
        guest.setIdHuesped(id);
        return guestService.updateGuest(guest);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        guestService.deleteGuest(id);
    }

}
