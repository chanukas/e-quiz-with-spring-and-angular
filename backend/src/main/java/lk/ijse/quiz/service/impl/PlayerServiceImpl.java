package lk.ijse.quiz.service.impl;

import lk.ijse.quiz.dto.CustomDTO;
import lk.ijse.quiz.dto.PlayerDTO;
import lk.ijse.quiz.entity.Player;
import lk.ijse.quiz.repository.PlayerRepository;
import lk.ijse.quiz.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public boolean addPlayer(PlayerDTO playerDTO) {
        playerRepository.save(new Player(playerDTO.getPid(),playerDTO.getPfullname(),playerDTO.getPaddress(),playerDTO.getPemail(),playerDTO.getPUserName(),playerDTO.getPPassword(),playerDTO.getPLevel()));
        return true;
    }

    @Override
    public List<PlayerDTO> getAllPlayer() {
        List<Player> all = playerRepository.findAll();
        List<PlayerDTO> playerDTOS=new ArrayList<>();
        for (Player player : all) {
            playerDTOS.add(new PlayerDTO(player.getPid(),player.getPfullname(),player.getPaddress(),player.getPemail(),player.getpUserName(),player.getpPassword(),player.getPLevel()));
        }
        return playerDTOS;
    }

    @Override
    public PlayerDTO getPlayer(int id) {
        Player player = playerRepository.findById(id).get();
        return new PlayerDTO(player.getPid(),player.getPfullname(),player.getPaddress(),player.getPemail(),player.getpUserName(),player.getpPassword(),player.getPLevel());
    }

    @Override
    public ArrayList<CustomDTO> getPlayerSummery(String Name) {
        return null;
    }

    @Override
    public String getSearchPlayer(String Email) {
        return null;
    }

    @Override
    public List<PlayerDTO> checkLogin(String Email, String Pass) {
        return null;
    }

    @Override
    public void PlayerLogOut(String Username) {

    }
}
