package com.codegym;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class controller {
    private static Pattern pattern;
    private Matcher matcher;

    /* Khai báo Regex */
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    controller(){
        pattern=Pattern.compile(EMAIL_REGEX);
    }
    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @PostMapping("/validate")
    public String result(@RequestParam ("email") String email, Model model){
        if (validateEmail(email)){
            model.addAttribute("message"," correct");
            return "success";
        }
        else {
            model.addAttribute("message"," incorrect");
            return "home";
        }
    }

    private boolean validateEmail(String regax){
        matcher=pattern.matcher(regax);
        return matcher.matches();

    }


}

