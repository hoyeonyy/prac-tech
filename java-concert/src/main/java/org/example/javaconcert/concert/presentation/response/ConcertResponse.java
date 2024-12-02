package org.example.javaconcert.concert.presentation.response;

import java.time.LocalDate;

import org.example.javaconcert.concert.domain.Concert;
import org.example.javaconcert.concert.domain.Tag;

public record ConcertResponse(
	String title,
	String location,
	LocalDate startAt,
	LocalDate endAt,
	Tag tag
) {

	public static ConcertResponse toResponse(Concert concert) {
		return new ConcertResponse(concert.getTitle(),
			concert.getLocation(),
			concert.getStartAt(),
			concert.getEndAt(),
			concert.getTag());
	}
}
