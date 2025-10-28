package com.mindtech.teste_estagio_back.controller;

import com.mindtech.teste_estagio_back.model.User;
import com.mindtech.teste_estagio_back.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/newsletter")
    public ResponseEntity<Void> subscribeNewsletter(@RequestBody User user) {
        userService.subscribeNewsletter(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
