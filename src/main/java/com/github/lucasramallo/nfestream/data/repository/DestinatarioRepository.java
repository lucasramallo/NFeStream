package com.github.lucasramallo.nfestream.data.repository;

import com.github.lucasramallo.nfestream.core.entity.Destinatario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinatarioRepository extends JpaRepository<Destinatario, Long> {
}
