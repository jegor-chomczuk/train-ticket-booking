package pl.training.realtime.adapters.persistence;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import pl.training.realtime.domain.Ride;
import pl.training.realtime.domain.RideRepository;
import pl.training.realtime.domain.RideStatus;

@Component
@RequiredArgsConstructor
public class RideFixtures {

	private final RideRepository rideRepository;

	@PostConstruct
	void addFixtures() {
		final Ride ride = Ride.builder()
				.id(UUID.randomUUID().toString())
				.status(RideStatus.PLANNED)
				.departureStation("Gdansk")
				.departureDateTime(LocalDateTime.of(2023, 8, 30, 12, 0, 0))
				.arrivalStation("Warsaw")
				.departureDateTime(LocalDateTime.of(2023, 8, 30, 15, 0, 0))
				.delay(Duration.ofHours(3))
				.build();
		rideRepository.persist(ride);
	}
}
