package prac.concert.concert.presentation.request

import prac.concert.concert.domain.Concert
import prac.concert.concert.domain.Tag
import java.time.LocalDate

data class ConcertRequest(
    val title: String,
    val location: String,
    val startAt: LocalDate,
    val endAt: LocalDate,
    val tag: Tag
) {

    fun toDomain(): Concert {
        return Concert(
            title = this.title,
            location = this.location,
            startAt = this.startAt,
            endAt = this.endAt,
            tag = this.tag
        )
    }
}
