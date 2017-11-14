package be.cegeka.selfEval5.domain.highways;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static be.cegeka.selfEval5.domain.highways.HighwayTestBuilder.aHighway;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class HighwayTest {

    private Highway highway;

    @Before
    public void setUp() throws Exception {
        highway = aHighway()
                .withDistance(300)
                .withName("E40")
                .build();
    }

    @Test
    public void aHighway_shouldContainAName() throws Exception {
        assertThat(highway.getName()).isEqualTo("E40");
    }

    @Test
    public void aHighway_shouldContainADistance() throws Exception {
        assertThat(highway.getDistance()).isEqualTo(300);
    }
}