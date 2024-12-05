package org.example.javaconcert.concert.domain;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Concert {

	private final String title;
	private final String location;
	private final LocalDate startAt;
	private final LocalDate endAt;
	private final Tag tag;

	@Builder
	public Concert(String title, String location, LocalDate startAt, LocalDate endAt, Tag tag) {
		this.title = title;
		this.location = location;
		this.startAt = startAt;
		this.endAt = endAt;
		this.tag = tag;
	}
}
