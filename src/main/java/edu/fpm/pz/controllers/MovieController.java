package edu.fpm.pz.controllers;

import edu.fpm.pz.dtos.CreateUpdateMovieDto;
import edu.fpm.pz.dtos.MovieDto;
import edu.fpm.pz.services.interfaces.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private IMovieService movieService;

    @GetMapping
    public List<MovieDto> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/{id}")
    public MovieDto getMovieById(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }

    @PostMapping
    public MovieDto addMovie(@RequestBody CreateUpdateMovieDto movie) {
        return movieService.createMovie(movie);
    }
}
