package edu.fpm.pz.services.interfaces;

import edu.fpm.pz.dtos.CreateUpdateMovieDto;
import edu.fpm.pz.dtos.MovieDto;

import java.util.List;

public interface IMovieService {
    List<MovieDto> getAllMovies();
    MovieDto getMovieById(Long id);
    MovieDto createMovie(CreateUpdateMovieDto dto);
}
