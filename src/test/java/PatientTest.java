import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientTest {

    @Test
    public void patientShouldHaveName() {
        Patient patient = new Patient("", 20, 10);
        String result = patient.getName();
        assertEquals("", result);
    }

    @Test
    public void patientShouldHaveBlood() {
        String name = "";
        Patient patient = new Patient("", 20, 10);
        int result = patient.getBlood_Level();
        assertEquals(20, result);
    }

    @Test
    public void patientShouldHaveHealth() {
        String name = "";
        Patient patient = new Patient(" ", 20, 10);
        int result = patient.getHealth_Level();
        assertEquals(10, result);
    }

    @Test
    public void patientShouldGiveBloodToNurse(){
        Patient underTest = new Patient("testPatient", 20, 10);
        underTest.NurseDrawBlood();
        int result = underTest.getBlood_Level();
        assertEquals(16, result);
    }

    @Test
    public void patientShouldReceiveHealthFromNurse(){
        Patient underTest = new Patient("testPatient", 20, 10);
        underTest.NurseHeal();
        int result = underTest.getHealth_Level();
        assertEquals(14, result);
    }

    @Test
    public void patientShouldGiveBloodToDoctor(){
        Patient underTest = new Patient("testPatient", 20, 10);
        underTest.DoctorDrawBlood();
        int result = underTest.getBlood_Level();
        assertEquals(16, result);
    }

    @Test
    public void patientShouldReceiveHealthFromDoctor(){
        Patient underTest = new Patient("testPatient",20, 10);
        underTest.DoctorHeal();
        int result = underTest.getHealth_Level();
        assertEquals(14, result);

    }

}
