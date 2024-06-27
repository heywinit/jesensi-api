package dev.heywinit.jesensiapi.controller;

import dev.heywinit.jesensiapi.model.Missile;
import dev.heywinit.jesensiapi.service.MissileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/missile")
public class MissileController {

    @Autowired
    private MissileService missileService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Missile>> getAll() {
        return ResponseEntity.ok(missileService.getAll());
    }

    @GetMapping("/getById")
    public ResponseEntity<Missile> getById(@RequestParam String id) {
        return ResponseEntity.ok(missileService.getById(id));
    }
}
