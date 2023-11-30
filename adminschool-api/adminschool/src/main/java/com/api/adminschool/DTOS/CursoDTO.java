package com.api.adminschool.dtos;

import com.api.adminschool.entities.Curso;
import com.api.adminschool.entities.Professor;
import com.api.adminschool.entities.Turma;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class CursoDTO {
    private Long id;
    private String nome;
    @JsonProperty("professor_id")
    private Long professorID;
    private Date createdAt;
    private Date updatedAt;
    private List<Turma> turmas;
    private Professor professor;
    @JsonProperty("turmas_id")
    private List<Long> turmasID;

    public CursoDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getProfessorID() {
        return professorID;
    }

    public void setProfessorID(Long professorID) {
        this.professorID = professorID;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Long> getTurmasID() {
        return turmasID;
    }

    public void setTurmasID(List<Long> turmasID) {
        this.turmasID = turmasID;
    }

    public Curso parseToObject() {
        Curso curso = new Curso();
        curso.setId(this.getProfessorID());
        curso.setNome(this.getNome());
        curso.setTurmas(this.getTurmas());
        curso.setProfessor(this.getProfessor());
        curso.setCreatedAt(this.getCreatedAt());
        curso.setUpdatedAt(this.getUpdatedAt());

        return curso;
    }
}
