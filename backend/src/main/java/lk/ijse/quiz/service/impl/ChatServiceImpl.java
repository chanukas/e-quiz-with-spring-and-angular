package lk.ijse.quiz.service.impl;

import lk.ijse.quiz.dto.PlayerDTO;
import lk.ijse.quiz.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class ChatServiceImpl implements ChatService {

    @Override
    public ArrayList<PlayerDTO> getAll() {
        return null;
    }

    @Override
    public PlayerDTO get(String username) {
        return null;
    }

    @Override
    public boolean checkCredentials(String username, String password) {
        return false;
    }

    @Override
    public boolean updateClientList() {
        return false;
    }

    @Override
    public void notifyAllPlyer(String Username, String Message) {

    }
}
