package com.example.crud_Hotel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Reservations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long IdReservation;
    private String fechaEntrada;
    private String fechaSalida;
    private double valor;
    private String formaPago;

    // Relación muchos a muchos con Guest
    @ManyToOne
    @JoinColumn(name = "idGuest")
    private Guest guest;

    // Relación muchos a muchos con Room
    @ManyToOne
    @JoinColumn(name = "idRoom")
    private Room room;

    public Reservations() {

    }

    public Reservations(Long idReservation, String fechaEntrada, String fechaSalida, double valor, String formaPago,
            Guest guest, Room room) {
        IdReservation = idReservation;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.valor = valor;
        this.formaPago = formaPago;
        this.guest = guest;
        this.room = room;
    }

    public Long getIdReservation() {
        return IdReservation;
    }

    public void setIdReservation(Long idReservation) {
        IdReservation = idReservation;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
    public Guest getGuest() {
        return guest;
    }
    public void setGuest(Guest guest) {
        this.guest = guest;
    }
    public Room getRoom() {
        return room;
    }
    public void setRoom(Room room) {
        this.room = room;
    }
}
