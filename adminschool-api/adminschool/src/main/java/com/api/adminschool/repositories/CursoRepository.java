package com.api.adminschool.repositories;

import com.api.adminschool.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    @Query("SELECT cursos FROM Curso cursos WHERE cursos.id = ?1")
    public Curso findOne(Long id);
}