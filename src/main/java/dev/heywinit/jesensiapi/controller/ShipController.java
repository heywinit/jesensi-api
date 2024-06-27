package dev.heywinit.jesensiapi.controller;

import dev.heywinit.jesensiapi.model.Ship;
import dev.heywinit.jesensiapi.service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ship")
public class ShipController {

    @Autowired
    private ShipService shipService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Ship>> getAll() {
        return ResponseEntity.ok(shipService.getAll());
    }

    @GetMapping("/getById")
    public ResponseEntity<Ship> getById(@RequestParam String id) {
        return ResponseEntity.ok(shipService.getById(id));
    }
}
