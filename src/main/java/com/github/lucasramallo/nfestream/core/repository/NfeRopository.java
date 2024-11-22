package com.github.lucasramallo.nfestream.core.repository;

import com.github.lucasramallo.nfestream.core.entity.Nfe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NfeRopository extends JpaRepository<Nfe, Long> {
}
