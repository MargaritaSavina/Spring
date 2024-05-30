package ru.gb.sem7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.gb.sem7.service.AdminService;
import ru.gb.sem7.service.UserServise;

@Controller
public class AccountController {

    private  UserServise userService;
    private  AdminService adminService;
    @GetMapping("/private-data")
    public String admin(Model model){
        model.addAttribute("text", adminService.getStr());
        return "admin";
    }
    @GetMapping("/public-data")
    public String user(Model model){
        model.addAttribute("text", userService.getStr());
        return "user";
    }


}
