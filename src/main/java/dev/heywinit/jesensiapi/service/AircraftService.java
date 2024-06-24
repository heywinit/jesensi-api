package dev.heywinit.jesensiapi.service;

import dev.heywinit.jesensiapi.exception.ResourceNotFoundException;
import dev.heywinit.jesensiapi.model.Aircraft;
import dev.heywinit.jesensiapi.repository.AircraftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AircraftService {

    @Autowired
    private AircraftRepository aircraftRepository;

    public List<Aircraft> getAll() {
        return aircraftRepository.findAll();
    }

    public Aircraft getById(String id) {
        return aircraftRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Aircraft not found with id: " + id));
    }

    public List<Aircraft> getRandom(String type) {
        List<Aircraft> allAircraft = aircraftRepository.findAll();

        List<Aircraft> jets = allAircraft.stream()
                .filter(aircraft -> type.equalsIgnoreCase(aircraft.getType()))
                .collect(Collectors.toList());

        if (jets.size() <= 10) {
            return jets;
        }

        Collections.shuffle(jets);
        return jets.subList(0, 10);
    }
}
