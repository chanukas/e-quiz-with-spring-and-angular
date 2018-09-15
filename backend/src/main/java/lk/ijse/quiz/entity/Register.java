package lk.ijse.quiz.entity;

import javax.persistence.*;

@Entity
public class Register {

    private String rdate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumns(@JoinColumn(name = "Gid",referencedColumnName = "Gid",insertable = false,updatable = false))
    private Game game;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumns(@JoinColumn(name = "Pid",referencedColumnName = "Pid",insertable = false,updatable = false))
    private Player player;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumns(@JoinColumn(name = "Rid",referencedColumnName = "Rid",insertable = false,updatable = false))
    private Result result;

    @EmbeddedId
    private Register_PK register_pk;

    public Register() {
    }

    public Register(String rdate, Game game, Player player, Result result, Register_PK register_pk) {
        this.setRdate(rdate);
        this.setGame(game);
        this.setPlayer(player);
        this.setResult(result);
        this.setRegister_pk(register_pk);
    }


    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Register_PK getRegister_pk() {
        return register_pk;
    }

    public void setRegister_pk(Register_PK register_pk) {
        this.register_pk = register_pk;
    }

    @Override
    public String toString() {
        return "Register{" +
                "rdate='" + rdate + '\'' +
                ", game=" + game +
                ", player=" + player +
                ", result=" + result +
                ", register_pk=" + register_pk +
                '}';
    }
}
