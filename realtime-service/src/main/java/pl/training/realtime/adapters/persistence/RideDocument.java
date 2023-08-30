package pl.training.realtime.adapters.persistence;

import java.time.Duration;
import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class RideDocument {

	String id;

	String status;

	String departureStation;

	LocalDateTime departureDateTime;

	String arrivalStation;

	LocalDateTime arrivalDateTime;

	Duration delay;
}
