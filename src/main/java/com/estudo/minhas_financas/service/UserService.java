package com.estudo.minhas_financas.service;

import com.estudo.minhas_financas.model.User;
import com.estudo.minhas_financas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> index() {
        return userRepository.findAll();
    }
}
