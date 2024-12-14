package com.ifpi.edu.jogo_do_milhao.models;
import jakarta.persistence.*;
import java.util.Date;


@Entity
@Table(name = "alternativa")
public class Alternativas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pergunta_id", nullable = false)
    private Pergunta pergunta;

    @Column(nullable = false, length = 255)
    private String alternativa;


}
