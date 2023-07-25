package com.estudo.minhas_financas.rest_controller;

import com.estudo.minhas_financas.model.UserModel;
import com.estudo.minhas_financas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRestController {

    @Autowired
    private UserService userService;


    @GetMapping("/list.json")
    public List<UserModel> index() {
        return userService.index();
    }
}
