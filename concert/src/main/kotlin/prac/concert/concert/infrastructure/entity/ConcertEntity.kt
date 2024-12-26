package prac.concert.concert.infrastructure.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import prac.concert.concert.domain.Concert
import prac.concert.concert.domain.Tag
import java.time.LocalDate

@Entity
class ConcertEntity(
    var title: String,
    var location: String,
    var startAt: LocalDate,
    var endAt: LocalDate,
    var tag: Tag
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0

    companion object {
        fun toEntity(concert: Concert): ConcertEntity{
            return ConcertEntity(
                title = concert.title,
                location = concert.location,
                startAt = concert.startAt,
                endAt = concert.endAt,
                tag = concert.tag
            )
        }
    }

    fun toDomain(): Concert{
        return Concert(
            title = this.title,
            location = this.location,
            startAt = this.startAt,
            endAt = this.endAt,
            tag = this.tag
        )
    }
}
