package prac.concert.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne

@Entity
class Place(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long? = null,

    @Column
    val region : Region,

    @Column
    val location : String,

    @OneToOne
    @JoinColumn(name = "concert_id")
    val concert : Concert,
){

    constructor(
        region : Region,
        location : String,
        concert : Concert
    ) : this(
        id = null,
        region = region,
        location = location,
        concert = concert
    )
}