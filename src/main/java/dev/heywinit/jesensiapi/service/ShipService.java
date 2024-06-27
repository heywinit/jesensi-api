package dev.heywinit.jesensiapi.service;

import dev.heywinit.jesensiapi.exception.ResourceNotFoundException;
import dev.heywinit.jesensiapi.model.Ship;
import dev.heywinit.jesensiapi.repository.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipService {

    @Autowired
    private ShipRepository shipRepository;

    public List<Ship> getAll() {
        return shipRepository.findAll();
    }
    public Ship getById(String id) {
        return shipRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Ship not found with id: " + id));
    }
}
