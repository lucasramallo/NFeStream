package com.github.lucasramallo.nfestream.data.repository;

import com.github.lucasramallo.nfestream.core.domain.Emitente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmitenteRepository extends JpaRepository<Emitente, Long> {
}
