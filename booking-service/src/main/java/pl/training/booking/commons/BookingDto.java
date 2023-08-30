package pl.training.booking.commons;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookingDto {

	String id;
	String value;
	Instant timestamp;
	String status;

}
