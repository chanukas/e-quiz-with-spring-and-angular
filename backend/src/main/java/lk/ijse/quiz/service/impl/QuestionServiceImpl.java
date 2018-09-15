package lk.ijse.quiz.service.impl;

import lk.ijse.quiz.dto.CustomDTO;
import lk.ijse.quiz.dto.QuestionDTO;
import lk.ijse.quiz.entity.Question;
import lk.ijse.quiz.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Override
    public boolean addQuestion(QuestionDTO questionDTO) {
        return false;
    }

    @Override
    public ArrayList<CustomDTO> getAllQuestion() {
        return null;
    }

    @Override
    public ArrayList<Question> getQuestion() {
        return null;
    }

    @Override
    public boolean deleteQuestion(int id) {
        return false;
    }

    @Override
    public ArrayList<CustomDTO> getRandomQuestion(String categery) {
        return null;
    }
}
