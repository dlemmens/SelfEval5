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

    @Test
    public void equals_SameHighway_isTrue() throws Exception {
        assertThat(highway).isEqualTo(highway);
    }

    @Test
    public void equals_NullObject_isFalse() throws Exception {
        assertThat(highway).isNotEqualTo(null);
    }

    @Test
    public void equals_otherClass_isFalse() throws Exception {
        assertThat(highway).isNotEqualTo(new Object());
    }

    @Test
    public void equals_highwayWithOtherName_isFalse() throws Exception {
        assertThat(highway).isNotEqualTo(aHighway()
                .withDistance(300)
                .withName("kennedytunnel")
                .build());
    }

    @Test
    public void equals_highwayWithNullName_isFalse() throws Exception {
        assertThat(highway).isNotEqualTo(aHighway()
                .withDistance(300)
                .withName(null)
                .build());
    }

    @Test
    public void equals_highwayWithBothNullName_isTrue() throws Exception {
        assertThat(aHighway()
                .withDistance(300)
                .withName(null)
                .build()).isEqualTo(aHighway()
                .withDistance(300)
                .withName(null)
                .build());
    }

    @Test
    public void equals_highwayWithNoNullName_isFalse() throws Exception {
        assertThat(aHighway()
                .withDistance(300)
                .withName(null)
                .build()).isNotEqualTo(aHighway()
                .withDistance(300)
                .withName("E40")
                .build());
    }

    @Test
    public void equals_highwayWithOtherDistance_isFalse() throws Exception {
        assertThat(highway).isNotEqualTo(aHighway()
                .withDistance(255)
                .withName("E40")
                .build());
    }
}