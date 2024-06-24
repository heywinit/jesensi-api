package dev.heywinit.jesensiapi.controller;

import dev.heywinit.jesensiapi.model.Aircraft;
import dev.heywinit.jesensiapi.service.AircraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/aircraft")
public class AircraftController {

    @Autowired
    private AircraftService aircraftService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Aircraft>> getAll() {
        return ResponseEntity.ok(aircraftService.getAll());
    }

    @GetMapping("/getById")
    public ResponseEntity<Aircraft> getById(@RequestParam String id) {
        return ResponseEntity.ok(aircraftService.getById(id));
    }

    @GetMapping("/getRandom")
    public ResponseEntity<List<Aircraft>> getRandom(@RequestParam String type) {
        return ResponseEntity.ok(aircraftService.getRandom(type));
    }
}
