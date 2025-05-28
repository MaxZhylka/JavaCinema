package edu.fpm.pz.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Screening {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JoinColumn(name = "movie_id", nullable = false)
    private Long movieId;
    private LocalDateTime dateTime;
    private String hall;

    public Screening() {}

    public Screening(Long movieId, LocalDateTime dateTime, String hall) {
        this.movieId = movieId;
        this.dateTime = dateTime;
        this.hall = hall;
    }

    public Long getId() {
        return id;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }
}
