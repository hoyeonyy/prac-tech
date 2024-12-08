package prac.concert.response

import prac.concert.domain.Concert
import prac.concert.domain.Genre
import prac.concert.domain.Place
import prac.concert.domain.Region

data class ConcertDetailResponse(
    val name: String,
    val poster: String,
    val period: String,
    val region : Region,
    val location : String,
    val runningTime: Int,
    val ageLimit : String,
    val genre: Genre,
    val description: String
){
    companion object{
        fun of(concert : Concert) : ConcertDetailResponse{
            return ConcertDetailResponse(
                name = concert.name,
                poster = concert.poster,
                region = concert.place!!.region,
                location = concert.place!!.location,
                period = concert.period,
                runningTime = concert.runningTime,
                ageLimit = concert.ageLimit,
                genre = concert.genre,
                description = concert.description
            )
        }
    }
}