package com.api.adminschool.controllers;

import com.api.adminschool.dtos.CursoDTO;
import com.api.adminschool.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CursoController {
    @Autowired
    private CursoService cursoService;
    @GetMapping("/cursos")
    public List<?> getAllCursos() {
        return cursoService.getAllCursos();
    }
    @PostMapping("/salvar_curso")
    public ResponseEntity<String> saveCurso(@RequestBody CursoDTO dto) {
        return cursoService.saveCurso(dto);
    }
    @GetMapping("/curso/{id}")
    public ResponseEntity<?> showCurso(@PathVariable("id") Long id) {
        return cursoService.showCurso(id);
    }
    @DeleteMapping("/delete-curso/{id}")
    public ResponseEntity<String> deleteCurso(@PathVariable("id") Long id) {
        return cursoService.deleteCurso(id);
    }
    @PutMapping("/atualizar-curso/{id}")
    public ResponseEntity<String> atualizarCurso(@PathVariable("id") Long id, @RequestBody CursoDTO dto) {
        return cursoService.updateCurso(id, dto);
    }
}
