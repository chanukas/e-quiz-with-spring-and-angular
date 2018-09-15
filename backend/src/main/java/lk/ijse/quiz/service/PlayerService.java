package lk.ijse.quiz.service;



import lk.ijse.quiz.dto.CustomDTO;
import lk.ijse.quiz.dto.PlayerDTO;

import java.util.ArrayList;
import java.util.List;

public interface PlayerService {

    public boolean addPlayer(PlayerDTO playerDTO);
    public List<PlayerDTO> getAllPlayer();
    public PlayerDTO getPlayer(int id);
    public ArrayList<CustomDTO> getPlayerSummery(String Name);
    public String getSearchPlayer(String Email);
    public List<PlayerDTO> checkLogin(String Email, String Pass);
    public void PlayerLogOut(String Username);

}
