package org.example.javaconcert.concert.presentation.response;

import java.util.List;

public record AllConcertResponse(
	List<ConcertResponse> concertResponses
) {
}
