package prac.javaconcert.concert.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Enumerated(EnumType.STRING)
    private Region region;

    private String location;

    @OneToOne
    @JoinColumn(name = "concert_id")
    private Concert concert;

    public Place(Region region, String location, Concert concert) {
        this.region = region;
        this.location = location;
        this.concert = concert;
    }
}
