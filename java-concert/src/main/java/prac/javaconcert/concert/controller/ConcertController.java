package prac.javaconcert.concert.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prac.javaconcert.concert.response.ConcertPreview;
import prac.javaconcert.concert.service.ConcertService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/concert")
public class ConcertController {

    private final ConcertService concertService;

    @GetMapping
    public List<ConcertPreview> findAll(){
        return concertService.findAll();
    }
}
