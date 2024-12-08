package prac.concert.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import prac.concert.request.ConcertSaveRequest
import prac.concert.response.ConcertDetailResponse
import prac.concert.service.ConcertService

@RestController
@RequestMapping("/api/v1")
class ConcertController(
    private val concertService : ConcertService
){

//    @Autowired
//    lateinit var concertService : ConcertService

    @GetMapping("/concert")
    fun findAll() : List<ConcertDetailResponse> {
        return concertService.findAll();
    }

    @PostMapping("/concert")
    fun save(@RequestBody concertSaveRequest : ConcertSaveRequest) : ConcertDetailResponse{
        return concertService.save(concertSaveRequest);
    }
}