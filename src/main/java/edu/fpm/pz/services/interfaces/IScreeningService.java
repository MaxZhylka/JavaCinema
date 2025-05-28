package edu.fpm.pz.services.interfaces;

import edu.fpm.pz.dtos.CreateUpdateScreeningDto;
import edu.fpm.pz.dtos.ScreeningDto;

import java.util.List;

public interface IScreeningService {
    List<ScreeningDto> getAllScreenings();
    ScreeningDto getScreeningById(Long id);
    ScreeningDto createScreening(CreateUpdateScreeningDto dto);
}
