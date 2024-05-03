package edu.uao.project.backend.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uao.project.backend.Model.UsersModel;
import edu.uao.project.backend.Service.IUsersService;

@RestController
@RequestMapping ("/user")
public class UsersController {
    @Autowired
    IUsersService usersService;

    @PostMapping("/")
    public ResponseEntity<String> crearUsuario(@RequestBody UsersModel user) {
        usersService.crearUsuario(user);
        return new ResponseEntity<String>(usersService.crearUsuario(user), HttpStatus.OK);
    }
}
