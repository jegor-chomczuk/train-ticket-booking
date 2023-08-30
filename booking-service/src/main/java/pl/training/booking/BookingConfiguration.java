package pl.training.booking;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.training.booking.mappers.RestBookingMapper;
import pl.training.booking.ports.BookingService;
import pl.training.booking.services.BookingProcessor;

@Configuration
public class BookingConfiguration {

	@Bean
	public BookingService bookingService() {
		return new BookingProcessor();
	}

	@Bean
	public RestBookingMapper restBookingMapper(){
		return new RestBookingMapper();
	}

}
