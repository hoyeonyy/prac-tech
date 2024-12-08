package prac.javaconcert.concert.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import prac.javaconcert.concert.domain.Genre;
import prac.javaconcert.concert.domain.Place;
@Getter
@NoArgsConstructor
public class ConcertSaveRequest {
    private String name;


    // 콘서트 포스터
    private String poster;

    // 콘서트 장소
    private String region;

    private String location;

    // 콘서트 기간
    private String period;

    // 콘서트 시간
    private Integer runningTime;

    // 콘서트 관람 연령
    private String ageLimit;

    // 콘서트 장르
    private Genre genre;

    // 공연 정보
    private String Description;
}
