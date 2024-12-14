package com.ifpi.edu.jogo_do_milhao.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("inicio")
public class telaInicial {


    @GetMapping("/telaInicial")
    public String home() {
        return "telaInicial";
    }
}
