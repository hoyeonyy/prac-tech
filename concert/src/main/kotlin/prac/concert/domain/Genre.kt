package prac.concert.domain

enum class Genre(
    val displayName : String
){
    BALLADE("발라드"),
    ROCK("락/메탈"),
    HIPHOP("랩/힙합"),
    JAZZ("재즈/소울"),
    DINNER("디너쇼"),
    TROT("포크/트로트"),
    FESTIVAL("페스티벌"),
    INDIE("인디"),
    TALK("토크/강연"),
    FAN("팬클럽/팬미팅")
}