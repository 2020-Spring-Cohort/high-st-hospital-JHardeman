import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NurseTest {

    @Test
    public void nurseHasASalary(){
        Nurse underTest = new Nurse("testNurse", 1, false, 50000);
        int result = underTest.paySalary();
        assertEquals(50000, result);
    }

    @Test
    public void nurseCanDrawBlood(){
        Nurse underTest = new Nurse("testNurse", 1, false, 50000);
        Patient testPatient = new Patient("testPatient", 20, 10);
        underTest.drawblood(testPatient);
        int result = testPatient.getBlood_Level();
        assertEquals(16, result);
    }

    @Test
    public void nurseCanProvideCare(){
        Nurse underTest = new Nurse("testNurse", 1, false, 50000);
        Patient testPatient = new Patient("testPatient", 20, 10);
        underTest.healPatient(testPatient);
        int result = testPatient.getHealth_Level();
        assertEquals(14, result);
    }
}
