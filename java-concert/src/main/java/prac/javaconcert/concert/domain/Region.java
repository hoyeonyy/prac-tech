package prac.javaconcert.concert.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Region {
    SEOUL("서울"),
    CHUNGCHEONG("충청"),
    JEOLLA("전라"),
    GYEONGGI("경기"),
    GYEONGSANG("경상"),
    GANGWON("강원");

    private String name;
}
