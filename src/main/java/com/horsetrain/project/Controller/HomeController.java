package com.horsetrain.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(){
        return "index";
    }

    @GetMapping("/breed")
    public String breedPage(){
        return "breed";
    }

    @GetMapping("/diet")
    public String dietPage(){
        return "diet";
    }

    @GetMapping("/behaviour")
    public String behaviourPage(){
        return "behaviour";
    }

    @GetMapping("/contact")
    public String contactPage(){
        return "contact";
    }

    @GetMapping("/sickness")
    public String sicknessPage(){
        return "sickness";
    }
}
