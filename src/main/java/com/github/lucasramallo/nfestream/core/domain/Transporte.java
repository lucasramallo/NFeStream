package com.github.lucasramallo.nfestream.core.domain;

import com.github.lucasramallo.nfestream.core.model.NfeJAXBModel;
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

    @OneToOne
    @JoinColumn(name = "nfe_id", referencedColumnName = "id", nullable = false)
    private Nfe nfe;

    public void nfeModelToEntity(NfeJAXBModel nfeModel) {
        this.setModalidadeFrete(nfeModel.getInfNFe().getTransp().getModFrete());
        this.setTransportadoraNome(nfeModel.getInfNFe().getTransp().getTransporta().getXNome());
        this.setTransportadoraCnpj(nfeModel.getInfNFe().getTransp().getTransporta().getCNPJ());
    }
}
