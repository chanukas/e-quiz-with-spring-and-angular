package lk.ijse.quiz.service;



import lk.ijse.quiz.dto.CustomDTO;
import lk.ijse.quiz.dto.QuestionDTO;
import lk.ijse.quiz.entity.Question;

import java.util.ArrayList;

public interface QuestionService {

    public boolean addQuestion(QuestionDTO questionDTO);
    public ArrayList<CustomDTO> getAllQuestion();
    public ArrayList<Question> getQuestion();
    public boolean deleteQuestion(int id);
    public ArrayList<CustomDTO> getRandomQuestion(String categery);
}
