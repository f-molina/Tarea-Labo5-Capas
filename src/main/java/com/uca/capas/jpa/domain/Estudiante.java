package com.uca.capas.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(schema = "public", name = "estudiante")
public class Estudiante {
    
    @Id
    @GeneratedValue(generator = "estudiante_c_usuario_seq", strategy = GenerationType.IDENTITY)
    @Column(name = "c_usuario")
    private Integer codigoUsuario;

    @NotEmpty
    @Size(max = 50, message = "Maximo 50 caracteres")
    @Column(name = "nombre")
    private String nombre;

    @NotEmpty
    @Size(max = 50, message = "Maximo 50 caracteres")
    @Column(name = "apellido")
    private String apellido;

    @NotEmpty
    @Size(max = 10, message = "Maximo 10 caracteres")
    @Column(name = "carne")
    private String carnet;

    @NotEmpty
    @Size(max = 100, message = "Maximo 100 caracteres")
    @Column(name = "carrera")
    private String carrera;

    public Estudiante(){}

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
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

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    
}