import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void employeeHasAnIDNumber() {
        Employees underTest = new Employees("testName", 1, false,);
        String result = underTest.getIDNumber();
        assertEquals(String.valueOf(1), result);
    }

    private void assertEquals(String i, String result) {
    }


    @Test
    public void employeeHasAName() {
        Employees underTest = new Employees("testName", 1, false);
        String result = underTest.getName();
        assertEquals("testName", result);
    }


    @Test
    public void patientShouldHaveName() {
        Patient patient = new Patient("");
        String result = patient.getName();
        assertEquals("", result);
    }

    @Test
    public void patientShouldHaveBlood() {
        String name = "";
        Patient patient = new Patient(name"", 20);
        int result = patient.getBlood_Level();
        assertEquals(20, result);
    }

    private void assertEquals(int i, int result) {
    }

    @Test
    public void patientShouldHaveHealth() {
        String name = "";
        Patient patient = new Patient(name"", 10);
        int result = patient.getHealth_Level();
        assertEquals(10, result);
    }

}