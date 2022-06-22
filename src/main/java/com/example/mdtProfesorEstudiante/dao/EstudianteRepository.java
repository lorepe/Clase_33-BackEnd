package com.example.mdtProfesorEstudiante.dao;

import com.example.mdtProfesorEstudiante.modelo.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante,Integer> {
}
