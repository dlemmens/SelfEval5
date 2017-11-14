package be.cegeka.selfEval5.domain.highways;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class HighwayService {

    @Inject
    private HighwayRepository highwayRepository;

    public List<Highway> getAllHighways() {
        return highwayRepository.getAllHighways();
    }
}
