package edu.fpm.pz.repositories;

import edu.fpm.pz.entities.CinemaUser;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CinemaUserRepository extends JpaRepository<CinemaUser, Long> {
    Optional<CinemaUser> findByUsername(String username);
}
