
package com.example.gymdemo;

import java.util.Date;

public class Inscripcion {

    private Long id;
    private String nombreCompleto;
    private String dni;
    private Boolean Genero;
    private String tipoMembresia;
    private Date fechaInscripcion;

    // Constructor vacío
    public Inscripcion() {
    }

    // Constructor con parámetros
    public Inscripcion(Long id, String nombreCompleto,
                       String dni, Boolean Genero, String tipoMembresia) {

        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.Genero = Genero;
        this.tipoMembresia = tipoMembresia;
        this.fechaInscripcion = new Date();
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Boolean getGenero() {
        return Genero;
    }

    public void setGenero(Boolean Genero) {
        this.Genero = Genero;
    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

}
