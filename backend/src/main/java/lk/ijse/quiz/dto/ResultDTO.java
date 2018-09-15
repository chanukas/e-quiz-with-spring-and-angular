package lk.ijse.quiz.dto;

public class ResultDTO {

    private int Rid;
    private String Category;
    private int correctAnswer;
    private int wrongAnswer;

    private int Pid;

    private PlayerDTO Player;

    public ResultDTO() {
    }

    public ResultDTO(int rid, String category, int correctAnswer, int wrongAnswer, PlayerDTO player) {
        setRid(rid);
        setCategory(category);
        this.setCorrectAnswer(correctAnswer);
        this.setWrongAnswer(wrongAnswer);
        setPlayer(player);
    }

    public ResultDTO( String category, int correctAnswer, int wrongAnswer, PlayerDTO player) {
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

    public PlayerDTO getPlayer() {
        return Player;
    }

    public void setPlayer(PlayerDTO player) {
        Player = player;
    }

    @Override
    public String toString() {
        return "ResultDTO{" +
                "Rid=" + Rid +
                ", Category='" + Category + '\'' +
                ", correctAnswer=" + correctAnswer +
                ", wrongAnswer=" + wrongAnswer +
                ", Player=" + Player +
                '}';
    }

    public int getPid() {
        return Pid;
    }

    public void setPid(int pid) {
        Pid = pid;
    }
}
