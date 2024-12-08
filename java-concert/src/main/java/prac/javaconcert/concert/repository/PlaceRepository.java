package prac.javaconcert.concert.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prac.javaconcert.concert.domain.Place;

public interface PlaceRepository extends JpaRepository<Place, Long> {
}
