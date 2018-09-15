package lk.ijse.quiz.dto;

public class AnswerDTO{

    private int Aid;


    private String answer;
    private boolean correctAnswer;
    private QuestionDTO questionDTO;

    public AnswerDTO() {
    }

    public AnswerDTO(String answer, boolean correctAnswer, QuestionDTO questionDTO) {
        this.setAnswer(answer);
        this.setCorrectAnswer(correctAnswer);
        this.setQuestionDTO(questionDTO);
    }


    public int getAid() {
        return Aid;
    }

    public void setAid(int aid) {
        Aid = aid;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public QuestionDTO getQuestionDTO() {
        return questionDTO;
    }

    public void setQuestionDTO(QuestionDTO questionDTO) {
        this.questionDTO = questionDTO;
    }

    @Override
    public String toString() {
        return "AnswerDTO{" +
                "Aid=" + Aid +
                ", answer='" + answer + '\'' +
                ", correctAnswer=" + correctAnswer +
                ", questionDTO=" + questionDTO +
                '}';
    }
}

