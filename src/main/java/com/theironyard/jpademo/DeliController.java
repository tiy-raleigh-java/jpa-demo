package com.theironyard.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DeliController {

    private final SandwichRepository sandwichRepository;

    @Autowired
    public DeliController(SandwichRepository sandwichRepository) {
        this.sandwichRepository = sandwichRepository;
    }

    @GetMapping("/")
    public String listSandwiches(Model model){

        List<Sandwich> sandwiches = sandwichRepository.findAll();

        System.out.println(sandwiches);

        model.addAttribute("sandwiches", sandwiches);

        return "sandwiches";
    }

    @GetMapping("/delete")
    public String deleteSandwich(Integer id){

        sandwichRepository.delete(id);

        return "redirect:/";
    }

    @PostMapping("/saveSandwich")
    public String saveSandwich(String name, String description){
        Sandwich sandwich = new Sandwich();
        sandwich.setName(name);
        sandwich.setDescription(description);

        sandwichRepository.save(sandwich);

        return "redirect:/";
    }
}
