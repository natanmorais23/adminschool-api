package com.example.demo.controllers;

import com.api.adminschool.dtos.CursoDTO;
import com.api.adminschool.entities.Curso;
import com.api.adminschool.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;
    public List<?> getAllCursos() {
        try {
            List<String> listaVazia = new ArrayList<>();
            listaVazia.add("Nenhum curso cadastrado até o momento");
            if (cursoRepository.findAll().isEmpty()) {
                return listaVazia;
            }
            List<CursoDTO> cursosResponse = new ArrayList<>();
            for (Curso curso : cursoRepository.findAll()) {
                CursoDTO dto = curso.parseToDTO();
                cursosResponse.add(dto);
            }

            return cursosResponse;
        } catch (RuntimeException run) {
            throw new RuntimeException(run);
        }
    }


}
