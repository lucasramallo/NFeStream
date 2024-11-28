package com.github.lucasramallo.nfestream.core.domain;

import com.github.lucasramallo.nfestream.core.model.NfeJAXBModel;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "emitente")
@Data
@NoArgsConstructor
public class Emitente{

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

    public void nfeModelToEntity(NfeJAXBModel nfeModel) {
        this.setCnpj(nfeModel.getInfNFe().getEmit().getCNPJ());
        this.setNome(nfeModel.getInfNFe().getEmit().getXNome());
        this.setEndereco(nfeModel.getInfNFe().getEmit().getEnderEmit().toString());
        this.setTelefone(nfeModel.getInfNFe().getEmit().getFone());
        this.setEmail(nfeModel.getInfNFe().getEmit().getEmail());
    }
}