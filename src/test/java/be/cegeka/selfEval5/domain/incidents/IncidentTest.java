package be.cegeka.selfEval5.domain.incidents;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static be.cegeka.selfEval5.domain.incidents.IncidentTestBuilder.aIncident;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;
import static org.junit.Assert.*;

public class IncidentTest {

    private Incident incident;

    @Before

    public void setUp() throws Exception {
        incident = aIncident()
                .withDistance(12)
                .withName("E34 ongeval")
                .withType("Crash")
                .build();
    }

    @Test
    public void aIncident_shouldContainANAme() throws Exception {
        assertThat(incident.getDistance()).isEqualTo(12);
    }

    @Test
    public void aIncident_shouldContainAType() throws Exception {
        assertThat(incident.getName()).isEqualTo("E34 ongeval");
    }

    @Test
    public void aIncident_shouldContainADistance() throws Exception {
        assertThat(incident.getType()).isEqualTo("Crash");
    }

    @Test
    public void equals_SameIncident_isTrue() throws Exception {
        assertThat(incident).isEqualTo(incident);
    }

    @Test
    public void equals_nullObject_isFalse() throws Exception {
        assertThat(incident).isNotEqualTo(null);
    }

    @Test
    public void equals_otherClass_isFalse() throws Exception {
        assertThat(incident).isNotEqualTo(new Object());
    }

    @Test
    public void equals_incidentWithOtherDistance_isFalse() throws Exception {
        assertThat(incident).isNotEqualTo(aIncident()
                .withDistance(15)
                .withName("E34 ongeval")
                .withType("Crash")
                .build());
    }

    @Test
    public void equals_incidentWithOtherName_isFalse() throws Exception {
        assertThat(incident).isNotEqualTo(aIncident()
                .withDistance(12)
                .withName("boeboe")
                .withType("Crash")
                .build());
    }

    @Test
    public void equals_incidentWithNullName_isFalse() throws Exception {
        assertThat(incident).isNotEqualTo(aIncident()
                .withDistance(12)
                .withName(null)
                .withType("Crash")
                .build());
    }

    @Test
    public void equals_incidentWithBothNullName_isTrue() throws Exception {
        assertThat(aIncident()
                .withDistance(12)
                .withName(null)
                .withType("Crash")
                .build()).isEqualTo(aIncident()
                .withDistance(12)
                .withName(null)
                .withType("Crash")
                .build());
    }

    @Test
    public void equals_incidentWithNoNullName_isFalse() throws Exception {
        assertThat(aIncident()
                .withDistance(12)
                .withName(null)
                .withType("Crash")
                .build()).isNotEqualTo(aIncident()
                .withDistance(12)
                .withName("E34 ongeval")
                .withType("Crash")
                .build());
    }

    @Test
    public void equals_incidentWithOtherType_isFalse() throws Exception {
        assertThat(incident).isNotEqualTo(aIncident()
                .withDistance(12)
                .withName("E34 ongeval")
                .withType("oil spill")
                .build());
    }

    @Test
    public void equals_incidentWithNullType_isFalse() throws Exception {
        assertThat(incident).isNotEqualTo(aIncident()
                .withDistance(12)
                .withName("E34 ongeval")
                .withType(null)
                .build());
    }

    @Test
    public void equals_incidentWithBothNullType_isTrue() throws Exception {
        assertThat(aIncident()
                .withDistance(12)
                .withName("E34 ongeval")
                .withType(null)
                .build()).isEqualTo(aIncident()
                .withDistance(12)
                .withName("E34 ongeval")
                .withType(null)
                .build());
    }

    @Test
    public void equals_incidentWithNoNullType_isFalse() throws Exception {
        assertThat(aIncident()
                .withDistance(12)
                .withName("E34 ongeval")
                .withType(null)
                .build()).isNotEqualTo(aIncident()
                .withDistance(12)
                .withName("E34 ongeval")
                .withType("Crash")
                .build());
    }
}