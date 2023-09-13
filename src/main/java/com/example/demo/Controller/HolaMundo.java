package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HolaMundo {

    @GetMapping("/saludo")
    public String hola(@RequestParam (name = "nombre",required = false, defaultValue = "Programador") String nombre, Model model){
        model.addAttribute("mensaje", "Hola " + nombre + ", Este es tu primer Hola Mundo! usando Spring Boot! :D");
        return "plantilla";
    }
}
