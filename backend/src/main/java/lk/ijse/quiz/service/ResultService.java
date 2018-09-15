package lk.ijse.quiz.service;


import lk.ijse.quiz.dto.ResultDTO;

import java.util.ArrayList;

public interface ResultService  {

    public boolean addResult(ResultDTO resultDTO);
    public ArrayList<ResultDTO> RESULT_DTO_LIST();

}

