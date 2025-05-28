package edu.fpm.pz.repositories;

import edu.fpm.pz.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
