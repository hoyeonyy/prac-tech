package prac.javaconcert.concert.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import prac.javaconcert.concert.repository.ConcertRepository;
import prac.javaconcert.concert.response.ConcertPreview;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConcertService {

    private final ConcertRepository concertRepository;

    public List<ConcertPreview> findAll(){
        return concertRepository.findAll()
                .stream()
                .map(concert -> ConcertPreview.of(concert))
                .toList();
    }
}
