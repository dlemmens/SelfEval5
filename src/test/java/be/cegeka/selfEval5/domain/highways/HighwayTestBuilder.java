package be.cegeka.selfEval5.domain.highways;

import org.springframework.test.util.ReflectionTestUtils;

public class HighwayTestBuilder {

    private int id;
    private String name;
    private int distance;

    public static HighwayTestBuilder aHighway() {
        return new HighwayTestBuilder()
                .withName("E40")
                .withDistance(500);
    }

    public HighwayTestBuilder withId(int id) {
        this.id = id;
        return this;
    }

    public HighwayTestBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public HighwayTestBuilder withDistance(int distance) {
        this.distance = distance;
        return this;
    }

    public Highway build() {
        Highway highway = new Highway(name, distance);
        ReflectionTestUtils.setField(highway, "id", id);
        return highway;
    }
}
