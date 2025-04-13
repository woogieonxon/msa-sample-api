package com.kpaas.nameservice.service;

import com.kpaas.nameservice.model.NameEntity;
import com.kpaas.nameservice.repository.NameRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NameService {
    private final NameRepository nameRepository;

    public NameService(NameRepository nameRepository) {
        this.nameRepository = nameRepository;
    }

    public Optional<NameEntity> getNameByNo(Long id) {
        return nameRepository.findById(id);
    }
}
