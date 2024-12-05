package org.example.javaconcert.concert.infrastructure.entity;

import java.time.LocalDate;

import org.example.javaconcert.concert.domain.Concert;
import org.example.javaconcert.concert.domain.Tag;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
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

	@Builder
	public ConcertEntity(String title, String location, LocalDate startAt, LocalDate endAt, Tag tag) {
		this.title = title;
		this.location = location;
		this.startAt = startAt;
		this.endAt = endAt;
		this.tag = tag;
	}

	public static ConcertEntity toEntity(Concert concert) {
		return ConcertEntity.builder()
			.title(concert.getTitle())
			.location(concert.getLocation())
			.startAt(concert.getStartAt())
			.endAt(concert.getEndAt())
			.tag(concert.getTag())
			.build();
	}

	public Concert toDomain() {
		return Concert.builder()
			.title(title)
			.location(location)
			.startAt(startAt)
			.endAt(endAt)
			.tag(tag)
			.build();
	}
}
