package pl.training.realtime.domain;

import java.time.Duration;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Ride {

	String id;

	RideStatus status;

	String departureStation;

	LocalDateTime departureDateTime;

	String arrivalStation;

	LocalDateTime arrivalDateTime;

	Duration delay;
}
