package prac.javaconcert.concert.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Concert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    // 콘서트 이름
    private String name;


    // 콘서트 포스터
    private String poster;

    // 콘서트 장소
    @OneToOne(mappedBy = "concert")
    private Place place;

    // 콘서트 기간
    private String period;

    // 콘서트 시간
    private Integer runningTime;

    // 콘서트 관람 연령
    private String ageLimit;

    // 콘서트 장르
    @Enumerated(EnumType.STRING)
    private Genre genre;

    // 콘서트 정보
    private String description;

    public Concert(String name, String poster, String period, Integer runningTime, String ageLimit, Genre genre, String description) {
        this.name = name;
        this.poster = poster;
        this.period = period;
        this.runningTime = runningTime;
        this.ageLimit = ageLimit;
        this.genre = genre;
        this.description = description;
    }
}
