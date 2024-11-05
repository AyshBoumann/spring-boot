package aysha.boumann.atividade.repository;

import aysha.boumann.atividade.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}