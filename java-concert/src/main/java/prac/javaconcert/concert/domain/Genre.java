package prac.javaconcert.concert.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Genre {

    BALLADE("발라드"),
    ROCK("락/메탈"),
    HIPHOP("랩/힙합"),
    JAZZ("재즈/소울"),
    DINNER("디너쇼"),
    TROT("포크/트로트"),
    FESTIVAL("페스티벌"),
    INDIE("인디"),
    TALK("토크/강연"),
    FAN("팬클럽/팬미팅");

    private String name;
}
