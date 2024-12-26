package prac.concert.concert.business

import jakarta.transaction.Transactional
import org.springframework.stereotype.Service
import prac.concert.concert.domain.ConcertRepository
import prac.concert.concert.presentation.request.ConcertRequest
import prac.concert.concert.presentation.response.AllConcertResponse
import prac.concert.concert.presentation.response.ConcertResponse

@Service
class ConcertService(
        private val concertRepository: ConcertRepository
) {

    fun findAll(): AllConcertResponse {
        val concertResponses = concertRepository.findAll()
                .map { concert -> ConcertResponse.toResponse(concert) }

        return AllConcertResponse(concertResponses)
    }

    fun findById(id: Long): ConcertResponse {
        return ConcertResponse.toResponse(concertRepository.findById(id))
    }

    @Transactional
    fun save(concertRequest: ConcertRequest): Long {
        return concertRepository.save(concertRequest.toDomain())
    }
}
