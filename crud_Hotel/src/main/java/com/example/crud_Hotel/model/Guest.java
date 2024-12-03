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
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGuest;
    private String nombre;
    private String apellido;
    private String FechaNacimiento;
    private String nacionalidad;
    private String telefono;

    // Al eliminar un huesped de actualiza en cascada
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Reservations> reservas = new ArrayList<>();

    public Guest() {
    }

    public Guest(Long idGuest, String nombre, String apellido, String fechaNacimiento, String nacionalidad,
            String telefono, List<Reservations> reservas) {
        this.idGuest = idGuest;
        this.nombre = nombre;
        this.apellido = apellido;
        FechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.reservas = reservas;
    }

    public Long getIdHuesped() {
        return idGuest;
    }

    public void setIdHuesped(Long idGuest) {
        this.idGuest = idGuest;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Reservations> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reservations> reservas) {
        this.reservas = reservas;
    }
}