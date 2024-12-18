package org.example.javaconcert.concert.presentation.request;

import java.time.LocalDate;

import org.example.javaconcert.concert.domain.Concert;
import org.example.javaconcert.concert.domain.Tag;

public record ConcertRequest(
	String title,
	String location,
	LocalDate startAt,
	LocalDate endAt,
	Tag tag
) {

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
