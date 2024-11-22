package com.github.lucasramallo.nfestream.data.repository;

import com.github.lucasramallo.nfestream.core.entity.ItemNfe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemNfeRepository extends JpaRepository<ItemNfe, Long> {
}
