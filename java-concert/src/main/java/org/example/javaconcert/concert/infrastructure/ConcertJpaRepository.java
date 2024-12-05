package org.example.javaconcert.concert.infrastructure;

import org.example.javaconcert.concert.infrastructure.entity.ConcertEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcertJpaRepository extends JpaRepository<ConcertEntity, Long> {
}
