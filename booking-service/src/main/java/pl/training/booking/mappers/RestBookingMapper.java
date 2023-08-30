package pl.training.booking.mappers;

import java.time.Instant;
import pl.training.booking.commons.Booking;
import pl.training.booking.commons.BookingDto;
import pl.training.booking.commons.BookingStatus;

public class RestBookingMapper {

	public BookingDto toDto(Booking payment){
		return new BookingDto(payment.getId(), payment.getValue().toString(), Instant.now(), BookingStatus.CONFIRMED.toString());
	}

}