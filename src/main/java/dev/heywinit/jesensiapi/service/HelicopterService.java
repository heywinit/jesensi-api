package dev.heywinit.jesensiapi.service;

import dev.heywinit.jesensiapi.exception.ResourceNotFoundException;
import dev.heywinit.jesensiapi.model.Helicopter;
import dev.heywinit.jesensiapi.repository.HelicopterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class HelicopterService {

    @Autowired
    private HelicopterRepository helicopterRepository;

    public List<Helicopter> getAll() {
        return helicopterRepository.findAll();
    }

    public Helicopter getById(String id) {
        return helicopterRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Helicopter not found with id: " + id));
    }

    public List<Helicopter> getRandom() {
        List<Helicopter> helicopters = helicopterRepository.findAll();

        if (helicopters.size() <= 10) {
            return helicopters;
        }

        Collections.shuffle(helicopters);
        return helicopters.subList(0, 10);
    }
}
