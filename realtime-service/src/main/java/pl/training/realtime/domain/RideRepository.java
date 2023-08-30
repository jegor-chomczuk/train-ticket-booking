package pl.training.realtime.domain;

import reactor.core.publisher.Mono;

public interface RideRepository {

	Mono<Ride> persist(Ride ride);

	Mono<Ride> getById(String id);
}
