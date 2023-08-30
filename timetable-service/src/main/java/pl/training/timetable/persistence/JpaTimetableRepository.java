package pl.training.timetable.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTimetableRepository extends JpaRepository<TimetableEntity, String> {


}
