package be.cegeka.selfEval5.domain.highways;

import be.cegeka.selfEval5.domain.incidents.Incident;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "HIGHWAYS")
public class Highway {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DISTANCE")
    private int distance;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "highway_id")
    private List<Incident> incidents;

    public Highway() {
    }

    public Highway(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Highway highway = (Highway) o;

        if (id != highway.id) return false;
        if (distance != highway.distance) return false;
        return name != null ? name.equals(highway.name) : highway.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + distance;
        return result;
    }
}