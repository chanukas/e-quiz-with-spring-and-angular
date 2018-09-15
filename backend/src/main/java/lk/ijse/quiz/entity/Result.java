package lk.ijse.quiz.entity;

import javax.persistence.*;

@Entity
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Rid;
    private String Category;
    private int correctAnswer;
    private int wrongAnswer;

    @OneToOne(cascade = CascadeType.ALL)
    private Player Player;

    public Result() {
    }

    public Result(String category, int correctAnswer, int wrongAnswer, Player player) {
        setCategory(category);
        this.setCorrectAnswer(correctAnswer);
        this.setWrongAnswer(wrongAnswer);
        setPlayer(player);
    }


    public int getRid() {
        return Rid;
    }

    public void setRid(int rid) {
        Rid = rid;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getWrongAnswer() {
        return wrongAnswer;
    }

    public void setWrongAnswer(int wrongAnswer) {
        this.wrongAnswer = wrongAnswer;
    }

    public Player getPlayer() {
        return Player;
    }

    public void setPlayer(Player player) {
        Player = player;
    }

    @Override
    public String toString() {
        return "Result{" +
                "Rid=" + Rid +
                ", Category='" + Category + '\'' +
                ", correctAnswer=" + correctAnswer +
                ", wrongAnswer=" + wrongAnswer +
                ", Player=" + Player +
                '}';
    }
}
