package be.cegeka.selfEval5.domain.incidents;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class IncidentService {

    @Inject
    private IncidentRepository incidentRepository;


    public void addIncident(String name, String type, int distance) {
        incidentRepository.addIncident(new Incident(name,type,distance));
    }
}
