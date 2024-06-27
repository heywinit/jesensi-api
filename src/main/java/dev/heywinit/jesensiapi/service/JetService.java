package dev.heywinit.jesensiapi.service;

import dev.heywinit.jesensiapi.exception.ResourceNotFoundException;
import dev.heywinit.jesensiapi.model.Jet;
import dev.heywinit.jesensiapi.repository.JetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class JetService {

    @Autowired
    private JetRepository jetRepository;

    public List<Jet> getAll() {
        return jetRepository.findAll();
    }

    public Jet getById(String id) {
        return jetRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Jet not found with id: " + id));
    }

    public List<Jet> getRandom() {
        List<Jet> jets = jetRepository.findAll();

        if (jets.size() <= 10) {
            return jets;
        }

        Collections.shuffle(jets);
        return jets.subList(0, 10);
    }
}
