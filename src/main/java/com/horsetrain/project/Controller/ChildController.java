package com.horsetrain.project.Controller;

import com.horsetrain.project.Entity.Child;
import com.horsetrain.project.Service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ChildController {

    @Autowired
    private ChildService childService;

    @GetMapping("/child")
    public String showChildPage(Model model){
        model.addAttribute("childs", childService.getAllChild());
        model.addAttribute("newChild", new Child());
        return "child";
    }

    @PostMapping("/addChild")
    public String addChild(@ModelAttribute Child child, RedirectAttributes redirectAttributes){
        childService.saveChild(child);
        redirectAttributes.addFlashAttribute("success","CHild added Successfully!");
        return "redirect:/members";
    }


    @GetMapping("/deleteChild/{id}")
    public String deleteAdult(@PathVariable Long id) {
        childService.deleteChild(id);
        return "redirect:/members";
    }

    @PostMapping("/updateChild")
    public String updateAdult(@ModelAttribute Child child) {
        childService.updateChild(child);
        return "redirect:/members";
    }


}
