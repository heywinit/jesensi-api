package dev.heywinit.jesensiapi.repository;

import dev.heywinit.jesensiapi.model.Engine;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EngineRepository extends MongoRepository<Engine, String>{ }
