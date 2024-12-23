package prac.concert.concert.infrastructure

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import prac.concert.concert.infrastructure.entity.ConcertEntity

@Repository
interface ConcertJpaRepository : JpaRepository<ConcertEntity, Long>{
}
