package lk.ijse.quiz.service.impl;

import lk.ijse.quiz.dto.ResultDTO;
import lk.ijse.quiz.service.ResultService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ResultServiceImpl implements ResultService  {
    @Override
    public boolean addResult(ResultDTO resultDTO) {
        return false;
    }

    @Override
    public ArrayList<ResultDTO> RESULT_DTO_LIST() {
        return null;
    }
}
