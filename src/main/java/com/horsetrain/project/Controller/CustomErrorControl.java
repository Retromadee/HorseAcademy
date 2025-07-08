package com.horsetrain.project.Controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorControl implements ErrorController {
    @RequestMapping("/error")
    public String erroHandle(){
        return "Page Error";
    }
}
