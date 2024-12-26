package prac.concert.concert.domain

import org.springframework.stereotype.Component
import prac.concert.concert.infrastructure.ConcertJpaRepository
import prac.concert.concert.infrastructure.entity.ConcertEntity

@Component
class ConcertRepository(
    private val concertJpaRepository: ConcertJpaRepository
) {

    fun findAll(): List<Concert>{
        return concertJpaRepository.findAll()
            .map { entity -> entity.toDomain() }
    }

    fun findById(id : Long) : Concert{
        return concertJpaRepository.findById(id)
            .orElseThrow{ IllegalArgumentException("id가 없습니다.") }
            .toDomain()
    }

    fun save(concert: Concert): Long{
        val entity = concertJpaRepository.save(ConcertEntity.toEntity(concert))
        return entity.id;
    }
}
