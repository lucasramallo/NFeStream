package com.github.lucasramallo.nfestream.core.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "produto_servico")
public class ProdutoServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String codigo;

    @Column(nullable = false, length = 255)
    private String descricao;

    @Column(length = 50)
    private String unidade;

    @Column(precision = 10, scale = 2)
    private BigDecimal precoUnitario;

    @Column(length = 10)
    private String ncm;
}

