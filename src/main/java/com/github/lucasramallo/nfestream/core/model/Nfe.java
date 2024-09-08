package com.github.lucasramallo.nfestream.core.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "nfe")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Nfe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 44, unique = true)
    private String chaveAcesso;

    @Column(nullable = false)
    private Integer numeroNfe;

    @Column(length = 3)
    private String serie;

    @Column(nullable = false)
    private LocalDateTime dataEmissao;

    @Column(length = 50)
    private String tipoOperacao;

    @Column(precision = 10, scale = 2)
    private BigDecimal valorTotal;

    @ManyToOne
    @JoinColumn(name = "emitente_id", nullable = false)
    private Emitente emitente;

    @ManyToOne
    @JoinColumn(name = "destinatario_id", nullable = false)
    private Destinatario destinatario;

    @Column(length = 255)
    private String caminhoPdf;

    @Column(length = 255)
    private String caminhoXml;
}
