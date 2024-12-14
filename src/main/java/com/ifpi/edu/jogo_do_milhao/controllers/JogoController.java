package com.ifpi.edu.jogo_do_milhao.controllers;

import com.ifpi.edu.jogo_do_milhao.models.Jogador;
import com.ifpi.edu.jogo_do_milhao.models.Pergunta;
import com.ifpi.edu.jogo_do_milhao.service.JogadorService;
import com.ifpi.edu.jogo_do_milhao.service.PerguntaService;
import org.apache.logging.log4j.message.StringFormattedMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/jogo")
public class JogoController {
    @Autowired
    private PerguntaService perguntaService;



    public JogoController(PerguntaService perguntaService, JogadorService jogadorService) {
        this.perguntaService = perguntaService;

    }
//    @Autowired
//    private JogadorService jogadorService;
//
//    public JogoController(JogadorService jogadorService) {
//        this.jogadorService = jogadorService;
//    }

//    @GetMapping("/listar")
//    public String listarJogador(){
//        List<Jogador> jogadores = jogadorService.findAll();
//        for (Jogador jogador : jogadores) {
//            System.out.println(jogador.toString());
//        }
//        return "ok";
//    }

        @GetMapping()
    public String iniciarJogo(Model model) {
        Pergunta pergunta = perguntaService.getPerguntaAleatoria();
        model.addAttribute("pergunta", pergunta);
        return "jogo";
    }

    @GetMapping("/listar")
    public String listar(){
        List<Pergunta> perguntas = perguntaService.listarPerguntas();
        for (Pergunta pergunta : perguntas) {
            System.out.println(pergunta);
        }
        return "ok";
    }


    @PostMapping("/responder")
    public String responderPergunta(@RequestParam int resposta, @RequestParam Long perguntaId, Model model) {
        Pergunta pergunta = perguntaService.getPerguntaById(perguntaId);
        boolean acertou = pergunta.getRespostaCorreta() == resposta;
        model.addAttribute("acertou", acertou);
        return "resultado";
    }
}
