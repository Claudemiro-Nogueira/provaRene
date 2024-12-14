package com.ifpi.edu.jogo_do_milhao.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pergunta")
public class Pergunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String enunciado;


//    @ManyToOne
//    @JoinColumn(name = "alternativa")
//    private List<Alternativas> alternativas;


    @Column(name = "resposta_correta")
    private int respostaCorreta; // Índice da resposta correta

//    public Alternativas getAlternativas() {
//        return alternativas;
//    }

//    public void setAlternativas(Alternativas alternativas) {
//        this.alternativas = alternativas;
//    }

    public Long getId() {
        return id;
    }

    public String getEnunciado() {
        return enunciado;
    }

//    public List<String> getAlternativas() {
//        return alternativas;
//    }

    public int getRespostaCorreta() {
        return respostaCorreta;
    }

}
