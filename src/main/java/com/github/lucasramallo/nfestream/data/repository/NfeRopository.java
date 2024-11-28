package com.github.lucasramallo.nfestream.data.repository;

import com.github.lucasramallo.nfestream.core.domain.Nfe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NfeRopository extends JpaRepository<Nfe, Long> {
}
