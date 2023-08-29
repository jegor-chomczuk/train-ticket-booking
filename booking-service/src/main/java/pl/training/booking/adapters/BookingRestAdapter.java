package pl.training.booking.adapters;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import pl.training.booking.ports.BookingService;

@RequestMapping("booking")
@RestController
@RequiredArgsConstructor
public class BookingRestAdapter {

	private final BookingService bookingService;
	private final RestBookingMapper mapper;

}
