import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeesTest {

    @Test
    public void employeeHasAName(){
      Employees underTest = new Employees("testName", 1, false, 1);
      String result = underTest.getName();
      assertEquals("testName", result);
    }

    @Test
    public void employeeHasAnIDNumber() {
        Employees underTest = new Employees("testName", 1, false, 1);
        int result = underTest.getIDNumber();
        assertEquals(1, result);

    }

    @Test
    public void employeeReceivesSalary(){
        Employees underTest = new Employees("tetsName", 1, false, 1);
        int result = underTest.getSalary();
        assertEquals(0, result);
    }







}