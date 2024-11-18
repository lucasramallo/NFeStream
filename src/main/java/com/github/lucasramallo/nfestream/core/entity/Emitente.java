package com.github.lucasramallo.nfestream.core.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "emitente")
@Data
@NoArgsConstructor
public class Emitente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 14, unique = true)
    private String cnpj;

    @Column(nullable = false, length = 255)
    private String nome;

    @Column(columnDefinition = "TEXT")
    private String endereco;

    @Column(length = 15)
    private String telefone;

    @Column(length = 255)
    private String email;
}