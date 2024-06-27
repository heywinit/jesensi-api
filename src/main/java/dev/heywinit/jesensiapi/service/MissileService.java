package dev.heywinit.jesensiapi.service;

import dev.heywinit.jesensiapi.exception.ResourceNotFoundException;
import dev.heywinit.jesensiapi.model.Missile;
import dev.heywinit.jesensiapi.repository.MissileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissileService {

    @Autowired
    private MissileRepository missileRepository;

    public List<Missile> getAll() {
        return missileRepository.findAll();
    }
    public Missile getById(String id) {
        return missileRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Missile not found with id: " + id));
    }
}
