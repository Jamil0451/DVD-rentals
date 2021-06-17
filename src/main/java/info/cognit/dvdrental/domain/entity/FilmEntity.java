package info.cognit.dvdrental.domain.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name ="FILM")
@Data
public class FilmEntity {

    @Id
    @Column(name = "FILM_ID")
    private Long filmId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "RELEASE_YEAR")
    private Integer releaseYear;

    @Column(name = "LANGUAGE_ID")
    private Long languageId;

    @Column(name = "RENTAL_DURATION")
    private Integer rentalDuration;

    @Column(name = "LAST_UPDATE")
    private LocalDateTime lastUpdate;

//    @Column(name = "RENTAL_RATE")
//    private Double rentalRate;
//
//    @Column(name = "LENGTH")
//    private Long length;
//
//    @Column(name = "REPLACEMENT_COST")
//    private Double replacementCost;
//
//    @Column(name = "RATING")
//    private Long rating;
//
//    @Column(name = "SPECIAL_FEATURES")
//    private String specialFeature;
//
//    @Column(name = "FULLTEXT")
//    private String fullText;


}
