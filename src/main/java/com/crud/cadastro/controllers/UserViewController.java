package com.crud.cadastro.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.crud.cadastro.models.UserModel;
import com.crud.cadastro.repositories.UserRepository;

@Controller
public class UserViewController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/home")
    public String homeView() {
        return "home";
    }

    @GetMapping("/cadastro")
    public ModelAndView cadastroView(UserModel userModel) {
        ModelAndView mv = new ModelAndView("/cadastro");
        mv.addObject("user", userModel);
        return mv;
    }

    @GetMapping("/lista")
    public ModelAndView usersListView() {
        ModelAndView mv = new ModelAndView("/lista");
        mv.addObject("listaUsers", userRepository.findAll());
        return mv;
    }

    @GetMapping("/usuario/{id}")
    public ModelAndView editUserView(@PathVariable("id") String id) {
        Optional<UserModel> user0 = userRepository.findById(id);
        ModelAndView mv = new ModelAndView("/usuario");
        UserModel userModel = user0.get();
        mv.addObject("user", userModel);
        return mv;
    }
}