package com.example.mdtProfesorEstudiante.modelo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Profesor {
    @Id
    @SequenceGenerator(name = "profesor_sequence", sequenceName = "profesor_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profesor_sequence")
    private Integer id;
    private String nombre;
    private String titulo;
    @OneToMany(mappedBy = "profesor",fetch = FetchType.LAZY)
    private Set<Estudiante> estudiantes= new HashSet<>();
    public Profesor() {
    }

    public Profesor(String nombre, String titulo) {
        this.nombre = nombre;
        this.titulo = titulo;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Set<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Set<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
