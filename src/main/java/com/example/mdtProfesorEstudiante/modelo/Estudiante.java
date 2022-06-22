package com.example.mdtProfesorEstudiante.modelo;

import javax.persistence.*;
import java.util.HashSet;

@Entity
@Table
public class Estudiante {
    @Id
    @SequenceGenerator(name = "estudiante_sequence",sequenceName = "estudiante_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estudiante_sequence")
    private Integer id;
    private String nombre;
    private Integer edad;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "profesor_id")
    private Profesor profesor;
    public Estudiante() {
    }

    public Estudiante(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
