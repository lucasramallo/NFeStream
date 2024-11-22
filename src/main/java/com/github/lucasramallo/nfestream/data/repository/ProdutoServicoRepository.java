package com.github.lucasramallo.nfestream.data.repository;

import com.github.lucasramallo.nfestream.core.entity.ProdutoServico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoServicoRepository extends JpaRepository<ProdutoServico, Long> {
}