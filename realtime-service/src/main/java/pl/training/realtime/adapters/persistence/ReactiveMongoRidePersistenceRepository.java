package pl.training.realtime.adapters.persistence;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ReactiveMongoRidePersistenceRepository extends ReactiveMongoRepository<RideDocument, String> {

}
