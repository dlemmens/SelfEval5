package be.cegeka.selfEval5.application;

import be.cegeka.selfEval5.domain.highways.Highway;
import be.cegeka.selfEval5.domain.highways.HighwayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping(path = "/highway")
@Transactional
public class HighwayController {

    @Inject
    private HighwayService highwayService;

    @GetMapping(path = "/getAll")
    public List<Highway> getAllHighways() {
        return highwayService.getAllHighways();
    }

    @PostMapping
    public void addIncident(int incidentId) {
        highwayService.addIncident(incidentId);

    }
}
