package be.cegeka.selfEval5.domain.highways;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Named
public class HighwayRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public List<Highway> getAllHighways() {
        return entityManager.createQuery("select h from Highway h",Highway.class)
                .getResultList();
    }
}
