import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HospitalTest {
    private Hospital underTest;
    private Employees testEmployees;

    @BeforeEach
    void setUp() {
        underTest = new Hospital();
        testEmployees = new Employees("testEmployees", 0, false);

    }

    @Test
    public void canAddEmployeesToList(){
        underTest.addEmployee(testEmployees);
        assertEquals(1, underTest.size());
    }

    @Test
    public void canPayEmployees(){
        underTest.addEmployee(testEmployees);
        underTest.payEmployees();
        assertTrue(testEmployees.getIsPaid());
    }
}
