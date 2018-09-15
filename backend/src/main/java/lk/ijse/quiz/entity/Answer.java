package lk.ijse.quiz.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Answer implements Serializable{

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int Aid;

        private String Answer;

        private boolean correctAnswer;

        @ManyToOne(cascade = CascadeType.ALL)
        private Question question;


        public Answer() {

        }

    public Answer(String answer, boolean correctAnswer, Question question) {
        Answer = answer;
        this.correctAnswer = correctAnswer;
        this.question = question;
    }


    public int getAid() {
        return Aid;
    }

    public void setAid(int aid) {
        Aid = aid;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "Aid=" + Aid +
                ", Answer='" + Answer + '\'' +
                ", correctAnswer=" + correctAnswer +
                ", question=" + question +
                '}';
    }
}
