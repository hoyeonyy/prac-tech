package prac.concert.repository

import org.springframework.data.jpa.repository.JpaRepository
import prac.concert.domain.Place

interface PlaceRepository : JpaRepository<Place, Long> {
}