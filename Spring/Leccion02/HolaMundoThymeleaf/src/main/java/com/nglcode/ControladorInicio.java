package com.nglcode;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio() {
        log.info("Ejecutando el controlador Spring MVC");
        return "index";
    }
    
}
