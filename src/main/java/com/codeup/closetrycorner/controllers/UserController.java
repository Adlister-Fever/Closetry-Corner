package com.example.closetrycorner.controllers;

import com.codeup.closetrycorner.models.User;
import com.codeup.closetrycorner.services.UserSvc;
import com.codeup.closetrycorner.services.UsersRepo;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private UserSvc userSvc;
    private PasswordEncoder passwordEncoder;


    public UserController(UserSvc users) {
        this.userSvc = users;
    }

    @GetMapping("/register")
    public String showSignupForm(Model model){
        model.addAttribute("user", new User());
        return "users/register";
    }

    @PostMapping("/register")
    public String saveUser(@ModelAttribute User user){
        String hash = passwordEncoder.encode(user.getPassword());
        user.setPassword(hash);
        userSvc.save(user);
        return "redirect:/garments";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "users/login";
    }

    @PostMapping("/login")
    public String loginUser(){
        return "/garments";
    }
}