package org.example.javaconcert.concert.domain;

import java.util.List;

import org.example.javaconcert.concert.infrastructure.ConcertJpaRepository;
import org.example.javaconcert.concert.infrastructure.entity.ConcertEntity;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ConcertRepository {

	private final ConcertJpaRepository concertJpaRepository;

	public List<Concert> findAll() {
		return concertJpaRepository.findAll().stream()
			.map(ConcertEntity::toDomain)
			.toList();
	}

	public Long save(Concert concert) {
		ConcertEntity entity = concertJpaRepository.save(ConcertEntity.toEntity(concert));
		return entity.getId();
	}
}
