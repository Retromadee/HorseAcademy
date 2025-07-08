package com.horsetrain.project.Controller;

import com.horsetrain.project.Service.AdultService;
import com.horsetrain.project.Service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class memberController {
    @Autowired
   private AdultService adultService;

    @Autowired
    private ChildService childService;

    @GetMapping("/members")
    public String memberPage(Model model) {
        model.addAttribute("adults", adultService.getAllAdults());
        model.addAttribute("childs", childService.getAllChild());
        return "members";
    }
}
