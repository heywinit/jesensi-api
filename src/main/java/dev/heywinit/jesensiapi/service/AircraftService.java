package dev.heywinit.jesensiapi.service;

import dev.heywinit.jesensiapi.model.Aircraft;
import dev.heywinit.jesensiapi.repository.AircraftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AircraftService {

    @Autowired
    private AircraftRepository aircraftRepository;

    public List<Aircraft> getAll() {
        List<Aircraft> aircraft = aircraftRepository.findAll();
        return aircraft;
    }
}
