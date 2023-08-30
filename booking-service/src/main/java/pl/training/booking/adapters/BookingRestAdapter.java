package pl.training.booking.adapters;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import pl.training.booking.commons.BookingDto;
import pl.training.booking.mappers.RestBookingMapper;
import pl.training.booking.ports.BookingService;

@RequestMapping("booking")
@RestController
@RequiredArgsConstructor
public class BookingRestAdapter {

	private final BookingService bookingService;
	private final RestBookingMapper mapper;
	@GetMapping("{id}")
	public ResponseEntity<BookingDto> getById(@PathVariable String id) {
		var paymentDomain = bookingService.getById(id);
		var paymentDto = mapper.toDto(paymentDomain);
		return ResponseEntity.ok(paymentDto);
	}
}
