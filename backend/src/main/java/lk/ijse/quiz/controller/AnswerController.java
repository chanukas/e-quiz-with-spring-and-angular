package lk.ijse.quiz.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/answers")
public class AnswerController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean check(){
        System.out.println("niyami");
        return false;
    }
}
