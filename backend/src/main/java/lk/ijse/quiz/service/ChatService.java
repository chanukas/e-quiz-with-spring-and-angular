package lk.ijse.quiz.service;


import lk.ijse.quiz.dto.PlayerDTO;

import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ChatService {

    public ArrayList<PlayerDTO> getAll();
    public PlayerDTO get(String username);
    public boolean checkCredentials(String username, String password);
    public boolean updateClientList();
    public void notifyAllPlyer(String Username, String Message);
}
