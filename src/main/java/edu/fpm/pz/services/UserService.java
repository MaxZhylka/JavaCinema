package edu.fpm.pz.services;

import edu.fpm.pz.dtos.UserRegistrationDto;
import edu.fpm.pz.entities.CinemaUser;
import edu.fpm.pz.repositories.CinemaUserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final CinemaUserRepository userRepo;
    private final PasswordEncoder passwordEncoder;

    public UserService(CinemaUserRepository userRepo, PasswordEncoder passwordEncoder) {
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
    }

    public void registerNewUser(UserRegistrationDto dto) {
        CinemaUser user = new CinemaUser();
        user.setUserName(dto.getUserName());
        user.setEmail(dto.getEmail());
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        user.setRole(dto.getRole());
        userRepo.save(user);
    }
}