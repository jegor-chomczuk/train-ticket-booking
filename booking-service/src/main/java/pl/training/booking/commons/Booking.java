package pl.training.booking.commons;

import java.time.Instant;
import org.javamoney.moneta.Money;


import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Booking {

	String id;
	Money value;
	Instant timestamp;
	BookingStatus status;

}
