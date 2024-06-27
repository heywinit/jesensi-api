package dev.heywinit.jesensiapi.repository;

import dev.heywinit.jesensiapi.model.Ship;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShipRepository extends MongoRepository<Ship, String> { }
