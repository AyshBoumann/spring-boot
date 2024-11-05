package aysha.boumann.atividade.repository;

import aysha.boumann.atividade.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
