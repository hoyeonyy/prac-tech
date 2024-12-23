package prac.concert.concert.domain

import java.time.LocalDate

class Concert(
    var title: String,
    var location: String,
    var startAt: LocalDate,
    var endAt: LocalDate,
    var tag: Tag
) {

}
