package com.mindtech.teste_estagio_back.services;

import com.mindtech.teste_estagio_back.model.User;
import com.mindtech.teste_estagio_back.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void subscribeNewsletter(User user) {
        user.setRegisterDate(LocalDateTime.now());
        userRepository.save(user);
    }
}
