package lk.ijse.quiz.repository;

import lk.ijse.quiz.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer,Integer> {
}
