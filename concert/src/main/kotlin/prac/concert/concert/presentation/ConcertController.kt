package prac.concert.concert.presentation

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import prac.concert.concert.business.ConcertService
import prac.concert.concert.presentation.request.ConcertRequest
import prac.concert.concert.presentation.response.AllConcertResponse
import prac.concert.concert.presentation.response.ConcertResponse
import java.net.URI

@RestController
class ConcertController(
        private val concertService: ConcertService
) {

    @GetMapping("/concerts")
    fun findAll(): ResponseEntity<AllConcertResponse> {
        val allConcertResponse = concertService.findAll()

        return ResponseEntity.ok(allConcertResponse)
    }

    @GetMapping("/concert")
    fun findById(@RequestParam id: Long): ResponseEntity<ConcertResponse> {
        val concertResponse = concertService.findById(id)

        return ResponseEntity.ok(concertResponse)
    }

    @PostMapping("/concert")
    fun save(@RequestBody concertRequest: ConcertRequest): ResponseEntity<Unit> {
        val concertId = concertService.save(concertRequest)
        return ResponseEntity.created(URI.create("/concert/${concertId}")).build()
    }

    @GetMapping("/health")
    fun checkHealth(): ResponseEntity<String> {
        return ResponseEntity.ok("Success Health Check")
    }
}
