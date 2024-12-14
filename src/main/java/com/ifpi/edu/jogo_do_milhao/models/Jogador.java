package com.ifpi.edu.jogo_do_milhao.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "jogador")
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickname;
    private int pontuacao;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_jogo")
    private Date dataJogo;

    // Getters e setters
}

