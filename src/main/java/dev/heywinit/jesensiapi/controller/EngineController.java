package dev.heywinit.jesensiapi.controller;

import dev.heywinit.jesensiapi.model.Engine;
import dev.heywinit.jesensiapi.service.EngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/engine")
public class EngineController {

    @Autowired
    private EngineService engineService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Engine>> getAll() {
        return ResponseEntity.ok(engineService.getAll());
    }

    @GetMapping("/getById")
    public ResponseEntity<Engine> getById(String id) {
        return ResponseEntity.ok(engineService.getById(id));
    }
}
