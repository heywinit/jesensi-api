package dev.heywinit.jesensiapi.repository;

import dev.heywinit.jesensiapi.model.Aircraft;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AircraftRepository extends MongoRepository<Aircraft, String> { }
