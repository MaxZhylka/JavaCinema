package edu.fpm.pz.services;

import edu.fpm.pz.dtos.CreateUpdateMovieDto;
import edu.fpm.pz.dtos.MovieDto;
import edu.fpm.pz.entities.Movie;
import edu.fpm.pz.repositories.MovieRepository;
import edu.fpm.pz.services.interfaces.IMovieService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService implements IMovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<MovieDto> getAllMovies() {
        return movieRepository.findAll()
                .stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public MovieDto getMovieById(Long id) {
        Movie movie = movieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Movie not found"));
        return mapToDto(movie);
    }

    @Override
    public MovieDto createMovie(CreateUpdateMovieDto dto) {
        Movie movie = new Movie(dto.getTitle(), dto.getGenre(), dto.getDuration(), dto.getAgeLimit());
        Movie saved = movieRepository.save(movie);
        return mapToDto(saved);
    }

    private MovieDto mapToDto(Movie movie) {
        return new MovieDto(movie.getId(), movie.getTitle(), movie.getGenre(), movie.getDuration(), movie.getAgeLimit());
    }
}
