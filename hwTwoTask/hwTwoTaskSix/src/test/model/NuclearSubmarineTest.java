package test.model;
import main.model.NuclearSubmarine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NuclearSubmarineTest {
    private NuclearSubmarine nuclearSubmarine;

    @Before
    public void setUp() {
        nuclearSubmarine = new NuclearSubmarine();
    }
    
    @Test
    public void startOfNuclearEngineShouldReturnStringAboutStart() {
        nuclearSubmarine.startNuclearSubmarine();
        assertEquals("Nuclear Engine is start", nuclearSubmarine.getStatusNuclearEngine());
    }
    @Test
    public void readinessOfNuclearSubmarineShouldReturnStringAboutReadiness() {
        assertEquals("Nuclear submarine is ready!", nuclearSubmarine.getStatusNuclearSubmarine());
    }
    @Test
    public void readinessOfNuclearEngineShouldReturnStringAboutReadiness() {
        assertEquals("Nuclear Engine is ready for start", nuclearSubmarine.getStatusNuclearEngine());
    }

    @Test
    public void startOfNuclearSubmarineShouldReturnStringAboutStart() {
        nuclearSubmarine.startNuclearSubmarine();
        assertEquals("Nuclear submarine has been sent sailing!", nuclearSubmarine.getStatusNuclearSubmarine());
    }


}
