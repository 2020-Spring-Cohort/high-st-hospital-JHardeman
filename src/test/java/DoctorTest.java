import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoctorTest {

    @Test
    public void doctorHasASpecialty(){
        Doctor underTest = new Doctor("testDoctor", 1, false, 90000, "Surgeon" );
        String result = underTest.getSpecialty();
        assertEquals("Surgeon", result);

    }

    @Test
    public void doctorHasASalary(){
        Doctor underTest = new Doctor("testDoctor", 1, false, 90000, "Surgeon");
        int result = underTest.paySalary();
        assertEquals(90000, result);
    }

    @Test
    public void doctorCanDrawBlood(){
        Doctor underTest = new Doctor("testDoctor", 1, false, 90000, "Surgeon");
        Patient testPatient = new Patient("testPatient", 20, 10);
        underTest.drawblood(testPatient);
        int result = testPatient.getBlood_Level();
        assertEquals(20, result);
    }

    @Test
    public void doctorCanProvideCare(){
        Doctor underTest = new Doctor("testDoctor", 1, false, 90000, "Surgeon");
        Patient testPatient = new Patient("testPatient", 20, 10);
        underTest.healPatient(testPatient);
        int result = testPatient.getHealth_Level();
        assertEquals(10, result);
    }
}
