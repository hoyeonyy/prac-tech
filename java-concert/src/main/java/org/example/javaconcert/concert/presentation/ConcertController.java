package org.example.javaconcert.concert.presentation;

import java.net.URI;

import org.example.javaconcert.concert.business.ConcertService;
import org.example.javaconcert.concert.presentation.request.ConcertRequest;
import org.example.javaconcert.concert.presentation.response.AllConcertResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ConcertController {

	private final ConcertService concertService;

	@GetMapping("/concert")
	public ResponseEntity<AllConcertResponse> findAll() {
		AllConcertResponse allConcertResponse = concertService.findAll();
		return ResponseEntity.ok(allConcertResponse);
	}

	@PostMapping("/concert")
	public ResponseEntity<Void> save(@RequestBody ConcertRequest concertRequest) {
		Long concertId = concertService.save(concertRequest);
		return ResponseEntity.created(URI.create("/concert/" + concertId)).build();
	}

}
