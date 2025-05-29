package edu.fpm.pz.controllers;

import edu.fpm.pz.dtos.CreateUpdateScreeningDto;
import edu.fpm.pz.dtos.ScreeningDto;
import edu.fpm.pz.services.interfaces.IScreeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/screenings")
public class ScreeningController {

    @Autowired
    private IScreeningService screeningService;

    @GetMapping
    public List<ScreeningDto> getAllScreenings() {
        return screeningService.getAllScreenings();
    }

    @GetMapping("/{id}")
    public ScreeningDto getScreeningById(@PathVariable Long id) {
        return screeningService.getScreeningById(id);
    }

    @PostMapping
    public ScreeningDto addScreening(@RequestBody CreateUpdateScreeningDto screening) {
        return screeningService.createScreening(screening);
    }
}
