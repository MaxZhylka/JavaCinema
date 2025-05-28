package edu.fpm.pz.dtos;

import java.time.LocalDateTime;

public class ScreeningDto {
    private Long id;
    private Long movieId;
    private LocalDateTime dateTime;
    private String hall;

    public ScreeningDto(Long id, Long movieId, LocalDateTime dateTime, String hall) {
        this.id = id;
        this.movieId = movieId;
        this.dateTime = dateTime;
        this.hall = hall;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
