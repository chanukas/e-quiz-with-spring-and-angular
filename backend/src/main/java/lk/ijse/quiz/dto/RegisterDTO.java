package lk.ijse.quiz.dto;

public class RegisterDTO {

    private String rdate;
    private GameDTO gameDTO;
    private PlayerDTO playerDTO;
    private ResultDTO resultDTO;

    public RegisterDTO() {
    }

    public RegisterDTO(String rdate, GameDTO gameDTO, PlayerDTO playerDTO, ResultDTO resultDTO) {
        this.setRdate(rdate);
        this.setGameDTO(gameDTO);
        this.setPlayerDTO(playerDTO);
        this.setResultDTO(resultDTO);
    }

    @Override
    public String toString() {
        return "RegisterDTO{" +
                "rdate='" + getRdate() + '\'' +
                ", gameDTO=" + getGameDTO() +
                ", playerDTO=" + getPlayerDTO() +
                ", resultDTO=" + getResultDTO() +
                '}';
    }


    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    public GameDTO getGameDTO() {
        return gameDTO;
    }

    public void setGameDTO(GameDTO gameDTO) {
        this.gameDTO = gameDTO;
    }

    public PlayerDTO getPlayerDTO() {
        return playerDTO;
    }

    public void setPlayerDTO(PlayerDTO playerDTO) {
        this.playerDTO = playerDTO;
    }

    public ResultDTO getResultDTO() {
        return resultDTO;
    }

    public void setResultDTO(ResultDTO resultDTO) {
        this.resultDTO = resultDTO;
    }
}
