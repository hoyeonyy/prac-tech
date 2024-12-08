package prac.javaconcert.concert.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import prac.javaconcert.concert.request.ConcertSaveRequest;
import prac.javaconcert.concert.response.ConcertDetailResponse;
import prac.javaconcert.concert.response.ConcertPreviewResponse;
import prac.javaconcert.concert.service.ConcertService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/concert")
public class ConcertController {

    private final ConcertService concertService;

    @GetMapping
    public List<ConcertPreviewResponse> findAll(){
        return concertService.findAll();
    }

    @PostMapping
    public ConcertDetailResponse save(@RequestBody ConcertSaveRequest concertSaveRequest){
        return concertService.save(concertSaveRequest);
    }
}
