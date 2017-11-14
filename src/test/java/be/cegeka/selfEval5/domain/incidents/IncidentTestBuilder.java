package be.cegeka.selfEval5.domain.incidents;

import org.springframework.test.util.ReflectionTestUtils;

public class IncidentTestBuilder {

    private int id;
    private String name;
    private String type;
    private int distance;

    public static IncidentTestBuilder aIncident() {
        return new IncidentTestBuilder()
                .withName("E34 ongeval")
                .withType("Crash")
                .withDistance(12);
    }

    public IncidentTestBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public IncidentTestBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public IncidentTestBuilder withDistance(int distance) {
        this.distance = distance;
        return this;
    }

    public Incident build() {
        Incident incident = new Incident(name, type, distance);
        ReflectionTestUtils.setField(incident, "id", id);
        return incident;
    }
}
