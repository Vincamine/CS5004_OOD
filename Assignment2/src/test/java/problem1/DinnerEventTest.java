package problem1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DinnerEventTest {
    private String clientName;
    private int numberOfPeople;
    private DinnerEvent dinnerEvent;

    @BeforeEach
    public void setUp() throws Exception {
        this.clientName = "Lily Williams";
        this.numberOfPeople = 68;
        this.dinnerEvent = new DinnerEvent(clientName, numberOfPeople);
    }

    @Test
    public void getNumberOfVegetarianEntrees() throws Exception {
        assertEquals((int) Math.round(this.numberOfPeople * 0.8),
            this.dinnerEvent.getNumberOfVegetarianEntrees());
    }

    @Test
    public void getNumberOfNonVegetarianEntrees() throws Exception {
        assertEquals((int) Math.round(this.numberOfPeople * 0.2),
            this.dinnerEvent.getNumberOfNonVegetarianEntrees());
    }

}