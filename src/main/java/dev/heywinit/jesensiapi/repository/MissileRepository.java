package dev.heywinit.jesensiapi.repository;

import dev.heywinit.jesensiapi.model.Missile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MissileRepository extends MongoRepository<Missile, String> { }
