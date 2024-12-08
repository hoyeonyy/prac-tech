package prac.concert.request

import prac.concert.domain.Genre
import prac.concert.domain.Region

data class ConcertSaveRequest(
    val name: String = "",
    val poster: String = "",
    val region: Region = Region.SEOUL,
    val location: String = "",
    val period: String = "",
    val runningTime: Int = 0,
    val ageLimit: String = "",
    val genre: Genre = Genre.BALLADE,
    val description: String = ""
)
