package org.example.javaconcert.concert.domain;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Concert {

	private final String title;
	private final String location;
	private final LocalDate startAt;
	private final LocalDate endAt;
	private final Tag tag;
}
