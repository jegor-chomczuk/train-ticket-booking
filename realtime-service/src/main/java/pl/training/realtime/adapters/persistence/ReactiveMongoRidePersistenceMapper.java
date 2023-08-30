package pl.training.realtime.adapters.persistence;

import org.mapstruct.Mapper;

import pl.training.realtime.domain.Ride;

@Mapper(componentModel = "spring")
public interface ReactiveMongoRidePersistenceMapper {

	RideDocument toDocument(Ride ride);

	Ride toDomain(RideDocument document);
}
