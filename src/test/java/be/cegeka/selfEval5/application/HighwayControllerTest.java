package be.cegeka.selfEval5.application;

import be.cegeka.selfEval5.domain.highways.HighwayService;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;


public class HighwayControllerTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();
    
    @InjectMocks
    private HighwayController highwayController;
    
    @Mock
    private HighwayService highwayService;

    @Test
    public void whenAskingallHighways_shouldActivateHighwayService() throws Exception {
        highwayController.getAllHighways();
        verify(highwayService).getAllHighways();
    }
}