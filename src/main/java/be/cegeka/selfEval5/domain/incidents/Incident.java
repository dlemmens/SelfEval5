package be.cegeka.selfEval5.domain.incidents;

import javax.persistence.*;

@Entity
@Table(name = "INCIDENTS")
public class Incident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "DISTANCE")
    private int distance;

    public Incident() {
    }

    public Incident(String name, String type, int distance) {
        this.name = name;
        this.type = type;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Incident incident = (Incident) o;

        if (id != incident.id) return false;
        if (distance != incident.distance) return false;
        if (name != null ? !name.equals(incident.name) : incident.name != null) return false;
        return type != null ? type.equals(incident.type) : incident.type == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + distance;
        return result;
    }
}
