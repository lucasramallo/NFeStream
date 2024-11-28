package com.github.lucasramallo.nfestream.core.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.math.BigDecimal;

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

    @OneToOne
    @JoinColumn(name = "produto_servico_id", referencedColumnName = "id")
    private ProdutoServico produtoServico;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal quantidade;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal valorUnitario;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal valorTotal;
}
