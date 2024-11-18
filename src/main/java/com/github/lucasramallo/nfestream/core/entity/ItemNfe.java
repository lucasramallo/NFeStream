package com.github.lucasramallo.nfestream.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;

@Entity
@Table(name = "item_nfe")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemNfe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "nfe_id", nullable = false)
    private Nfe nfe;

    @OneToMany
    @JoinColumn(name = "produto_servico_id")
    private ArrayList<ProdutoServico> produtoServico;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal quantidade;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal valorUnitario;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal valorTotal;
}