package prac.concert.repository

import org.springframework.data.jpa.repository.JpaRepository
import prac.concert.domain.Concert

interface ConcertRepository : JpaRepository<Concert, Long> {
}