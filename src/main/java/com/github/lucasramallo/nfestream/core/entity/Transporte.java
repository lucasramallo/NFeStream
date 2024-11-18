package com.github.lucasramallo.nfestream.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Table(name = "transporte")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String modalidadeFrete;

    @Column(length = 255)
    private String transportadoraNome;

    @Column(length = 14)
    private String transportadoraCnpj;
}
