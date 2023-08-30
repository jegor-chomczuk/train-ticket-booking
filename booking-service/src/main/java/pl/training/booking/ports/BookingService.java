package pl.training.booking.ports;

import pl.training.booking.commons.BookingRequest;
import pl.training.booking.commons.Page;
import pl.training.booking.commons.Booking;
import pl.training.booking.commons.BookingStatus;
import pl.training.booking.commons.ResultPage;

public interface BookingService {
	Booking process(BookingRequest bookingRequest);

	Booking getById(String id);

	ResultPage<Booking> getByStatus(BookingStatus bookingStatus, Page page);
}
