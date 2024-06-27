package dev.heywinit.jesensiapi.service;

import dev.heywinit.jesensiapi.exception.ResourceNotFoundException;
import dev.heywinit.jesensiapi.model.Engine;
import dev.heywinit.jesensiapi.repository.EngineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EngineService {
    @Autowired
    private EngineRepository engineRepository;

    public List<Engine> getAll() {
        return engineRepository.findAll();
    }

    public Engine getById(String id) {
        return engineRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Engine not found with id: " + id));
    }
}
