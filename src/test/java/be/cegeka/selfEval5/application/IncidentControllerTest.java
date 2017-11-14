package be.cegeka.selfEval5.application;

import be.cegeka.selfEval5.domain.incidents.IncidentService;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.verify;

public class IncidentControllerTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private IncidentController incidentController;

    @Mock
    private IncidentService incidentService;

    @Test
    public void addIncident_shouldUseIncidentService() throws Exception {
        incidentController.addIncident("E34 ongeval","Crash",12);
        verify(incidentService).addIncident("E34 ongeval","Crash",12);
    }
}
