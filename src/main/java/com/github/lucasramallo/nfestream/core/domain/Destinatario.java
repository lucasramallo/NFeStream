package com.github.lucasramallo.nfestream.core.domain;

import com.github.lucasramallo.nfestream.core.domain.interfaces.Domain;
import com.github.lucasramallo.nfestream.core.model.NfeJAXBModel;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "destinatario")
@Data
@NoArgsConstructor
public class Destinatario implements Domain {

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

    @Override
    public void nfeModelToEntity(NfeJAXBModel nfeModel) {
        // todo
    }
}