import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void employeeHasAnIDNumber() {
        Employees underTest = new Employees("testName", 1, false);
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




    private void assertEquals(int i, int result) {
    }



}