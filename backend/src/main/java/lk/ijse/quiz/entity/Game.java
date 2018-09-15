package lk.ijse.quiz.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Gid;

    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Game> gameList;


    public Game() {

    }

    public Game(String description, Game game) {
        this.setDescription(description);
        this.setGame(game);
    }


    public int getGid() {
        return Gid;
    }

    public void setGid(int gid) {
        Gid = gid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Game> getGame() {
        return gameList;
    }

    public void setGame(Game game) {
        this.gameList = gameList;
    }

    @Override
    public String toString() {
        return "Game{" +
                "Gid=" + Gid +
                ", description='" + description + '\'' +
                ", game=" + gameList +
                '}';
    }
}
