package pl.training.realtime.domain;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ReactiveRideService {

	private final RideRepository rideRepository;

	public Mono<Ride> getById(String id) {
		return rideRepository.getById(id);
	}
}
