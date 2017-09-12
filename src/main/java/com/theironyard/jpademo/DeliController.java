package com.theironyard.jpademo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DeliController {

    @GetMapping("/")
    public String listSandwiches(){

        return "sandwiches";
    }

    @PostMapping("/saveSandwich")
    public String saveSandwich(String name, String description){

        return "redirect:/";
    }
}
