package com.github.lucasramallo.nfestream.data.repository;

import com.github.lucasramallo.nfestream.core.domain.ItemNfe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemNfeRepository extends JpaRepository<ItemNfe, Long> {
}
