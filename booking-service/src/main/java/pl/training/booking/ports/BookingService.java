package pl.training.booking.ports;

import pl.training.booking.commons.BookingRequest;
import pl.training.booking.commons.Page;
import pl.training.booking.commons.Payment;
import pl.training.booking.commons.PaymentStatus;
import pl.training.booking.commons.ResultPage;

public interface BookingService {
	Payment process(BookingRequest bookingRequest);

	Payment getById(String id);

	ResultPage<Payment> getByStatus(PaymentStatus bookingStatus, Page page);
}
