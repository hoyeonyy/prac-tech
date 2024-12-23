package prac.concert.concert.presentation.response

import prac.concert.concert.domain.Concert
import prac.concert.concert.domain.Tag
import java.time.LocalDate

data class ConcertResponse(
    val title: String,
    val location: String,
    val startAt: LocalDate,
    val endAt: LocalDate,
    val tag: Tag
) {

    companion object{
        fun toResponse(concert: Concert): ConcertResponse {
            return ConcertResponse(
                title = concert.title,
                location = concert.location,
                startAt = concert.startAt,
                endAt = concert.endAt,
                tag = concert.tag
            )
        }
    }

}
