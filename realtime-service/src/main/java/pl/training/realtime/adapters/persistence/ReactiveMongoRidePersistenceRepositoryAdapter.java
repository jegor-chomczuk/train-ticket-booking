package pl.training.realtime.adapters.persistence;

import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;
import pl.training.realtime.domain.Ride;
import pl.training.realtime.domain.RideRepository;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class ReactiveMongoRidePersistenceRepositoryAdapter implements RideRepository {

	private final ReactiveMongoRidePersistenceMapper mapper;

	private final ReactiveMongoRidePersistenceRepository rideRepository;

	@Override
	public Mono<Ride> persist(Ride ride) {
		var rideDocument = mapper.toDocument(ride);
		return rideRepository.save(rideDocument)
				.map(mapper::toDomain);
	}

	@Override
	public Mono<Ride> getById(String id) {
		return rideRepository.findById(id)
				.map(mapper::toDomain);
	}
}
