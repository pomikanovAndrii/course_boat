package com.example.EasyProject.controller;

import com.example.EasyProject.model.Boat;
import com.example.EasyProject.repository.BoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoatAddController {
    @Autowired
    private BoatRepository boatRepository;

    @GetMapping("/add-boat")
    public String addBoat(Model model){
        model.addAttribute("boat", new Boat());
        return "add-boat";
    }
    @PostMapping("/add-boat")
    public String boat(@ModelAttribute Boat boat){
        boatRepository.save(boat);
        return "redirect:/catalog";
    }
}
