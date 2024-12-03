package com.example.crud_Hotel.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRoom;

    private String tipoHabitacion; // tipo de habitacion: individual, doble, suite
    private String descripcion; // descripcion de la habitacion
    private String estado; // estado de la habitacion: disponible, ocupado, mantenimiento
    private double precio; // precio de la habitacion

    // Relación con Reservations: una habitación puede tener varias reservas.
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Reservations> reservations = new ArrayList<>();

    public Room() {

    }

    public Room(Long idRoom, String tipoHabitacion, String descripcion, String estado, double precio,
            List<Reservations> reservations) {
        this.idRoom = idRoom;
        this.tipoHabitacion = tipoHabitacion;
        this.descripcion = descripcion;
        this.estado = estado;
        this.precio = precio;
        this.reservations = reservations;
    }

    // Getters and Setters
    public Long getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(Long idRoom) {
        this.idRoom = idRoom;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Reservations> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservations> reservations) {
        this.reservations = reservations;
    }
}
