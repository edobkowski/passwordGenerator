package com.codecool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@SpringBootApplication
public class Main {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
        public String passwordForm(Model model) {
        model.addAttribute("passwordSetup", new PasswordSetup());
        return "index";
    }

    @PostMapping("/")
        public String greetingSubmit(Model model, @ModelAttribute PasswordSetup passwordSetup) {
        PasswordGenerator passwordGenerator = new PasswordGenerator(passwordSetup);
        String password = passwordGenerator.generate();
        model.addAttribute("password", password);
        return "index";
    }
}
