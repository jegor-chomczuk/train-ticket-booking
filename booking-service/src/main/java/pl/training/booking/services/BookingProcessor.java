package pl.training.booking.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import pl.training.booking.commons.Booking;
import pl.training.booking.commons.BookingRequest;
import pl.training.booking.commons.BookingStatus;
import pl.training.booking.commons.Page;
import pl.training.booking.commons.ResultPage;
import pl.training.booking.ports.BookingService;

@Log
@RequiredArgsConstructor
public class BookingProcessor implements BookingService {

	@Override
	public Booking process(final BookingRequest bookingRequest) {
		return null;
	}

	@Override
	public Booking getById(final String id) {
		return null;
	}

	@Override
	public ResultPage<Booking> getByStatus(final BookingStatus bookingStatus, final Page page) {
		return null;
	}
}
