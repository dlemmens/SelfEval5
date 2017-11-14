package be.cegeka.selfEval5.domain.incidents;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class IncidentServiceTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private IncidentService incidentService;

    @Mock
    private IncidentRepository incidentRepository;

    @Test
    public void addIncident_shouldUseIncidentRepository() throws Exception {
        incidentService.addIncident("E34 ongeval","Crash",12);
        verify(incidentRepository).addIncident(new Incident("E34 ongeval","Crash",12));
    }
}