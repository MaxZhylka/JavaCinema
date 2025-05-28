package edu.fpm.pz.services;

import edu.fpm.pz.dtos.CreateUpdateScreeningDto;
import edu.fpm.pz.dtos.ScreeningDto;
import edu.fpm.pz.entities.Screening;
import edu.fpm.pz.repositories.ScreeningRepository;
import edu.fpm.pz.services.interfaces.IScreeningService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScreeningService implements IScreeningService {

    private final ScreeningRepository screeningRepository;

    public ScreeningService(ScreeningRepository screeningRepository) {
        this.screeningRepository = screeningRepository;
    }

    @Override
    public List<ScreeningDto> getAllScreenings() {
        return screeningRepository.findAll()
                .stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public ScreeningDto getScreeningById(Long id) {
        Screening screening = screeningRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Screening not found"));
        return mapToDto(screening);
    }

    @Override
    public ScreeningDto createScreening(CreateUpdateScreeningDto dto) {
        Screening screening = new Screening(dto.getMovieId(), dto.getDateTime(), dto.getHall());
        Screening saved = screeningRepository.save(screening);
        return mapToDto(saved);
    }

    private ScreeningDto mapToDto(Screening screening) {
        return new ScreeningDto(screening.getId(), screening.getMovieId(), screening.getDateTime(), screening.getHall());
    }
}
