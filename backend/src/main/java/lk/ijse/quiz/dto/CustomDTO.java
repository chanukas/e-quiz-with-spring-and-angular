package lk.ijse.quiz.dto;

public class CustomDTO {

    private int qid;
    private String category;
    private String descrption;
    private String answer;
    private boolean correctAnswer;

    private int correctAnswerCount;
    private int wrongAnswerCount;


    public CustomDTO() {
    }

    public CustomDTO(int qid, String category, String descrption, String answer, boolean correctAnswer) {
        this.setQid(qid);
        this.setCategory(category);
        this.setDescrption(descrption);
        this.setAnswer(answer);
        this.setCorrectAnswer(correctAnswer);
    }


    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
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

    public int getCorrectAnswerCount() {
        return correctAnswerCount;
    }

    public void setCorrectAnswerCount(int correctAnswerCount) {
        this.correctAnswerCount = correctAnswerCount;
    }

    public int getWrongAnswerCount() {
        return wrongAnswerCount;
    }

    public void setWrongAnswerCount(int wrongAnswerCount) {
        this.wrongAnswerCount = wrongAnswerCount;
    }
}
