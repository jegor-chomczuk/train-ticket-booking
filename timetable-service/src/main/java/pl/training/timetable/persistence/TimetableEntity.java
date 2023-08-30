package pl.training.timetable.persistence;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class TimetableEntity {

	@Id
	private String connectionId;
	private String origin;
	private String destination;
	private LocalDateTime arrival;
	private LocalDateTime departure;

}
