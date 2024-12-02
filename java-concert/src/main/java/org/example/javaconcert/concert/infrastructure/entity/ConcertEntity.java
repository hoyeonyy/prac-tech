package org.example.javaconcert.concert.infrastructure.entity;

import java.time.LocalDate;

import org.example.javaconcert.concert.domain.Concert;
import org.example.javaconcert.concert.domain.Tag;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class ConcertEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String location;
	private LocalDate startAt;
	private LocalDate endAt;
	private Tag tag;

	public Concert toDomain() {
		return new Concert(title, location, startAt, endAt, tag);
	}
}
