package com.horsetrain.project.Controller;

import com.horsetrain.project.Entity.Adult;
import com.horsetrain.project.Service.AdultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AdultController {

    @Autowired
    private AdultService adultService;

    @GetMapping("/adult")
    public String showAdultPage(Model model){
       model.addAttribute("adults", adultService.getAllAdults());
       model.addAttribute("newAdult", new Adult());
       return "adult";
    }


    @PostMapping("/addAdult")
    public String addUser(@ModelAttribute Adult adult, RedirectAttributes redirectAttributes) {
        adultService.saveAdult(adult);
        redirectAttributes.addFlashAttribute("success", "Adult added successfully!");
        return "redirect:/members";
    }


    @GetMapping("/deleteAdult/{id}")
    public String deleteAdult(@PathVariable Long id) {
        adultService.deleteAdult(id);
        return "redirect:/members";
    }

    @PostMapping("/updateAdult")
    public String updateAdult(@ModelAttribute Adult adult) {
        adultService.updateAdult(adult);
        return "redirect:/members";
    }




}
