package lk.ijse.quiz.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Question implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Qid;

    private String category;
    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Answer> answerList;


    public Question() {

    }

    public Question(String category, String description, List<Answer> answerList) {
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

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }

    @Override
    public String toString() {
        return "Question{" +
                "Qid=" + Qid +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", answerList=" + answerList +
                '}';
    }


}
