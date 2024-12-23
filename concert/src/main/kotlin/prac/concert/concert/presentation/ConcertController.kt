package prac.concert.concert.presentation

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import prac.concert.concert.business.ConcertService
import prac.concert.concert.presentation.request.ConcertRequest
import prac.concert.concert.presentation.response.AllConcertResponse
import java.net.URI

@RestController
class ConcertController(
    private val concertService: ConcertService
) {

    @GetMapping("/concert")
    fun findAll(): ResponseEntity<AllConcertResponse>{
        val allConcertResponse = concertService.findAll()

        return ResponseEntity.ok(allConcertResponse)
    }

    @PostMapping("/concert")
    fun save(@RequestBody concertRequest: ConcertRequest): ResponseEntity<Unit>{
        val concertId = concertService.save(concertRequest)
        return ResponseEntity.created(URI.create("/concert/${concertId}")).build()
    }
}
