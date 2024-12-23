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
    private var title: String,
    private var location: String,
    private var startAt: LocalDate,
    private var endAt: LocalDate,
    private var tag: Tag
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0

    protected constructor() : this(
        title = "",
        location = "",
        startAt = LocalDate.now(),
        endAt = LocalDate.now(),
        tag = Tag.JAZZ
    )

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
