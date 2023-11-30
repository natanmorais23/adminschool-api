package com.api.adminschool.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@NamedQuery(name = "Turma.getTurmasPorCurso", query = "SELECT t FROM Turma t WHERE t.curso.id=:idCurso")

@Entity
@Getter @Setter
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(nullable = false, updatable = false)
    private Curso curso;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;
}