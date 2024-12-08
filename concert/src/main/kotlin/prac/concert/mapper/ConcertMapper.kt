package prac.concert.mapper

import prac.concert.domain.Concert
import prac.concert.domain.Place
import prac.concert.request.ConcertSaveRequest
import prac.concert.response.ConcertDetailResponse

interface ConcertMapper {

    fun toEntity(concertSaveRequest: ConcertSaveRequest) : Concert
    fun toDTO(concert : Concert) : ConcertDetailResponse
}