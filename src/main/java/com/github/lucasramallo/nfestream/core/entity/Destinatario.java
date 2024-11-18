package com.github.lucasramallo.nfestream.core.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "destinatario")
@Data
@NoArgsConstructor
public class Destinatario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 14)
    private String cnpjCpf;

    @Column(nullable = false, length = 255)
    private String nome;

    @Column(columnDefinition = "TEXT")
    private String endereco;

    @Column(length = 15)
    private String telefone;

    @Column(length = 255)
    private String email;
}