package dev.heywinit.jesensiapi.repository;

import dev.heywinit.jesensiapi.model.Helicopter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelicopterRepository extends MongoRepository<Helicopter, String> { }
