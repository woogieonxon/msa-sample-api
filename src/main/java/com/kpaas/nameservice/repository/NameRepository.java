package com.kpaas.nameservice.repository;

import com.kpaas.nameservice.model.NameEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface NameRepository extends JpaRepository<NameEntity, Long> {
    Optional<NameEntity> findById(Long id);
}