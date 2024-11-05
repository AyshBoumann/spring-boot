package aysha.boumann.atividade.controller;

import aysha.boumann.atividade.model.Professor;
import aysha.boumann.atividade.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @PostMapping("/add")
    public ResponseEntity<String> addProfessor(@RequestBody Professor professor) {
        professorRepository.save(professor);
        return ResponseEntity.ok("Professor está em sala de aula.");
    }

    @GetMapping("/list")
    public ResponseEntity <List<Professor>> listProfessores() {
        List<Professor> professores = professorRepository.findAll();
        return ResponseEntity.ok(professores);
    }
}