package lk.ijse.quiz.dto;

import java.util.List;

public class QuestionDTO {

    private int Qid;

    private String category;
    private String description;

    private List<AnswerDTO> answerList;



    public QuestionDTO() {
    }

    public QuestionDTO(int qid, String category, String description, List<AnswerDTO> answerList) {
        setQid(qid);
        this.setCategory(category);
        this.setDescription(description);
        this.setAnswerList(answerList);
    }


    public int getQid() {
        return Qid;
    }

    public void setQid(int qid) {
        Qid = qid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<AnswerDTO> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<AnswerDTO> answerList) {
        this.answerList = answerList;
    }

    @Override
    public String toString() {
        return "QuestionDTO{" +
                "Qid=" + Qid +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", answerList=" + answerList +
                '}';
    }
}
