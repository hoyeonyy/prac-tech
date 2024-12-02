package org.example.javaconcert.concert.business;

import java.util.List;

import org.example.javaconcert.concert.domain.ConcertRepository;
import org.example.javaconcert.concert.presentation.response.AllConcertResponse;
import org.example.javaconcert.concert.presentation.response.ConcertResponse;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ConcertService {

	private final ConcertRepository concertRepository;

	public AllConcertResponse findAll() {
		List<ConcertResponse> concertResponses = concertRepository.findAll().stream()
			.map(ConcertResponse::toResponse)
			.toList();

		return new AllConcertResponse(concertResponses);
	}
}
