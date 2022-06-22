package com.example.mdtProfesorEstudiante.dao;

import com.example.mdtProfesorEstudiante.modelo.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor,Integer> {
}
