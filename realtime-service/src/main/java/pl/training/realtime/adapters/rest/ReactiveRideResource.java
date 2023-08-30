package pl.training.realtime.adapters.rest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerResponse;

import lombok.RequiredArgsConstructor;
import pl.training.realtime.domain.ReactiveRideService;
import pl.training.realtime.domain.Ride;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class ReactiveRideResource {

	private final ReactiveRideService reactiveRideService;

	public Mono<ServerResponse> getById(String id) {
		final Mono<Ride> rideMono = reactiveRideService.getById(id);
		return ServerResponse.ok()
				.contentType(MediaType.APPLICATION_STREAM_JSON)
				.body(rideMono, Ride.class);
	}
}
