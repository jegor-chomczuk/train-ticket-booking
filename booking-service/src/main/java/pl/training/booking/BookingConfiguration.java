package pl.training.booking;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.training.booking.ports.BookingService;

@Configuration
public class BookingConfiguration {

	@Bean
	public BookingService bookingService() {
		return null;
	}
}
