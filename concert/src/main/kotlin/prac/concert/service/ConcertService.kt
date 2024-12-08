package prac.concert.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import prac.concert.domain.Concert
import prac.concert.domain.Place
import prac.concert.repository.ConcertRepository
import prac.concert.repository.PlaceRepository
import prac.concert.request.ConcertSaveRequest
import prac.concert.response.ConcertDetailResponse

@Component
class ConcertService(
    private val concertRepository: ConcertRepository,
    private val placeRepository: PlaceRepository
){
    fun findAll(): List<ConcertDetailResponse> {
       return concertRepository.findAll()
            .stream()
            .map { ConcertDetailResponse.of(it) }
            .toList();
    }

    fun save(concertSaveRequest : ConcertSaveRequest) : ConcertDetailResponse{
        val concert = Concert(
            concertSaveRequest.name,
            concertSaveRequest.poster,
            concertSaveRequest.period,
            concertSaveRequest.runningTime,
            concertSaveRequest.ageLimit,
            concertSaveRequest.genre,
            concertSaveRequest.description)

        val savedConcert = concertRepository.save(concert);

            // end::,[])
        val place = Place(concertSaveRequest.region, concertSaveRequest.location, savedConcert)

        placeRepository.save(place);
        return ConcertDetailResponse.of(savedConcert)
    }

}