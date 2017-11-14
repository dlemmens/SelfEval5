package be.cegeka.selfEval5.application;

import be.cegeka.selfEval5.domain.incidents.IncidentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.transaction.Transactional;

@RestController
@RequestMapping(path = "/incident")
@Transactional
public class IncidentController {

    @Inject
    private IncidentService incidentService;


    public void addIncident(@RequestParam(value = "name",required = true) String name,
                            @RequestParam(value = "type",required = true) String type,
                            @RequestParam (value = "distance",required = true) int distance) {
        incidentService.addIncident(name,type,distance);
    }
}
