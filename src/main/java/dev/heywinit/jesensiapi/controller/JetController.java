package dev.heywinit.jesensiapi.controller;

import dev.heywinit.jesensiapi.model.Jet;
import dev.heywinit.jesensiapi.service.JetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/jet")
public class JetController {

    @Autowired
    private JetService jetService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Jet>> getAll() {
        return ResponseEntity.ok(jetService.getAll());
    }

    @GetMapping("/getById")
    public ResponseEntity<Jet> getById(@RequestParam String id) {
        return ResponseEntity.ok(jetService.getById(id));
    }

    @GetMapping("/getRandom")
    public ResponseEntity<List<Jet>> getRandom() {
        return ResponseEntity.ok(jetService.getRandom());
    }
}
