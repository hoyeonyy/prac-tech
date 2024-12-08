package prac.javaconcert.concert.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prac.javaconcert.concert.domain.Concert;

public interface ConcertRepository extends JpaRepository<Concert, Long> {
}
