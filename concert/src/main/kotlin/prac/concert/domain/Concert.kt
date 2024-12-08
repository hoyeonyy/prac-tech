package prac.concert.domain

import jakarta.persistence.*


@Entity
class Concert(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long? = null,

    @Column
    val name : String,


    @Column
    val poster : String,


    @OneToOne(mappedBy = "concert", fetch = FetchType.LAZY)
    var place : Place? = null,


    @Column
    val period : String,

    @Column
    val runningTime : Int,

    @Column
    val ageLimit : String,


    @Column
    @Enumerated(EnumType.STRING)
    val genre : Genre,

    @Column
    val description : String,
){
    constructor(
        name: String,
        poster: String,
        period: String,
        runningTime: Int,
        ageLimit: String,
        genre: Genre,
        description: String
    ) : this(
        id = null,
        name = name,
        poster = poster,
        period = period,
        runningTime = runningTime,
        ageLimit = ageLimit,
        genre = genre,
        description = description
    )
}