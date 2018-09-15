package lk.ijse.quiz.controller;

import lk.ijse.quiz.dto.UserDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {


    @PostMapping(value="api/v1/login", consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean canAuthenticate(@RequestBody UserDTO user){
        if(user.getUsername().equals("admin") && user.getPassword().equals("admin")){
            return true;
        }
        return false;
    }

}
