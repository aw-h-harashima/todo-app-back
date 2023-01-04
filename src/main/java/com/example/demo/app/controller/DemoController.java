package com.example.demo.app.controller;

import java.util.List;

import com.example.demo.domain.entity.Users;
import com.example.demo.domain.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class DemoController {
    @Autowired
    UsersRepository usersRepository;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        List<Users> userList=usersRepository.findAll();
        model.addAttribute("userslist", userList);
        return "index";
    }
}
