package lk.ijse.quiz.dto;

public class GameDTO {

    private int Gid;

    private String description;

    private GameDTO gameDTO;

    public GameDTO() {
    }

    public GameDTO(int gid, String description, GameDTO gameDTO) {
        setGid(gid);
        this.setDescription(description);
        this.setGameDTO(gameDTO);
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

    public GameDTO getGameDTO() {
        return gameDTO;
    }

    public void setGameDTO(GameDTO gameDTO) {
        this.gameDTO = gameDTO;
    }

    @Override
    public String toString() {
        return "GameDTO{" +
                "Gid=" + Gid +
                ", description='" + description + '\'' +
                ", gameDTO=" + gameDTO +
                '}';
    }
}
