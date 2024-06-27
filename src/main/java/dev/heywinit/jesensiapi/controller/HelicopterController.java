package dev.heywinit.jesensiapi.controller;

import dev.heywinit.jesensiapi.model.Helicopter;
import dev.heywinit.jesensiapi.service.HelicopterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/helicopter")
public class HelicopterController {

    @Autowired
    private HelicopterService helicopterService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Helicopter>> getAll() {
        return ResponseEntity.ok(helicopterService.getAll());
    }

    @GetMapping("/getById")
    public ResponseEntity<Helicopter> getById(@RequestParam String id) {
        return ResponseEntity.ok(helicopterService.getById(id));
    }

    @GetMapping("/getRandom")
    public ResponseEntity<List<Helicopter>> getRandom() {
        return ResponseEntity.ok(helicopterService.getRandom());
    }
}
