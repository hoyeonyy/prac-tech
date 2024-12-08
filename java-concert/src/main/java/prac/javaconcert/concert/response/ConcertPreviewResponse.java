package prac.javaconcert.concert.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import prac.javaconcert.concert.domain.Concert;
import prac.javaconcert.concert.domain.Genre;
import prac.javaconcert.concert.domain.Place;

@Getter
@NoArgsConstructor
public class ConcertPreviewResponse {

    private String name;


    // 콘서트 포스터
    private String poster;

    // 콘서트 장소
    private Place place;

    // 콘서트 기간
    private String period;

    // 콘서트 시간
    private Integer runningTime;

    // 콘서트 관람 연령
    private String ageLimit;

    // 콘서트 장르
    private Genre genre;

    @Builder
    private ConcertPreviewResponse(String name, String poster, Place place, String period, Integer runningTime, String ageLimit, Genre genre) {
        this.name = name;
        this.poster = poster;
        this.place = place;
        this.period = period;
        this.runningTime = runningTime;
        this.ageLimit = ageLimit;
        this.genre = genre;
    }

    public static ConcertPreviewResponse of(Concert concert){
        return ConcertPreviewResponse.builder()
                .name(concert.getName())
                .poster(concert.getPoster())
                .place(concert.getPlace())
                .period(concert.getPeriod())
                .runningTime(concert.getRunningTime())
                .ageLimit(concert.getAgeLimit())
                .genre(concert.getGenre())
                .build();
    }
}
