import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReceptionistTest {

    @Test
    public void receptionistIsOnPhone(){
        Receptionist underTest = new Receptionist("testReceptionist", 1, 45000, false, false);
        underTest.answerPhone();
        boolean result = underTest.getOnPhone();
        assertTrue(result);
    }
}
