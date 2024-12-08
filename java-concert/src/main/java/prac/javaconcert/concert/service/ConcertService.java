package prac.javaconcert.concert.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import prac.javaconcert.concert.domain.Concert;
import prac.javaconcert.concert.domain.Place;
import prac.javaconcert.concert.domain.Region;
import prac.javaconcert.concert.repository.ConcertRepository;
import prac.javaconcert.concert.repository.PlaceRepository;
import prac.javaconcert.concert.request.ConcertSaveRequest;
import prac.javaconcert.concert.response.ConcertDetailResponse;
import prac.javaconcert.concert.response.ConcertPreviewResponse;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ConcertService {

    private final ConcertRepository concertRepository;
    private final PlaceRepository placeRepository;

    public List<ConcertPreviewResponse> findAll(){
        return concertRepository.findAll()
                .stream()
                .map(concert -> ConcertPreviewResponse.of(concert))
                .toList();
    }

    @Transactional
    public ConcertDetailResponse save(ConcertSaveRequest concertSaveRequest) {

        Concert concert = new Concert(
                concertSaveRequest.getName(),
                concertSaveRequest.getPoster(),
                concertSaveRequest.getPeriod(),
                concertSaveRequest.getRunningTime(),
                concertSaveRequest.getAgeLimit(),
                concertSaveRequest.getGenre(),
                concertSaveRequest.getDescription());

        Concert savedConcert = concertRepository.save(concert);

        Place place = new Place(Region.valueOf(concertSaveRequest.getRegion()), concertSaveRequest.getLocation(), savedConcert);
        placeRepository.save(place);
        return ConcertDetailResponse.of(savedConcert);

    }
}
