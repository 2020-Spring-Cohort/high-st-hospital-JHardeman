import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HospitalTest {
    private Hospital underTest;
    private Employees testEmployees;

    @BeforeEach
    void setUp() {
        underTest = new Hospital();
        testEmployees = new Employees("testEmployees", 0, false, 1);

    }

    @Test
    public void canAddEmployeesToList(){
        underTest.addEmployeesToList(testEmployees);
        assertEquals(1, underTest.size());
    }

    @Test
    public void canPayEmployees(){
        underTest.addEmployeesToList(testEmployees);
        underTest.payEmployees();
        assertTrue(testEmployees.getIsPaid());
    }

    @Test
    public void canAddPatient(){
        Patient testPatient = new Patient("testPatient", 20, 10);
        Patient testPatient2 = new Patient("tetsPatient2", 20, 10);
        Patient testPatient3 = new Patient("testPateint3", 20, 10);
        Hospital underTest = new Hospital();
        underTest.addPatient(testPatient);
        underTest.addPatient(testPatient2);
        underTest.addPatient(testPatient3);
        ArrayList<Patient> retrievedPatients = underTest.retrievePatientList();
        assertEquals(3, retrievedPatients.size());


    }

    @Test
    public void shouldBeAbleToAddEmployee() {
        Employees testEmployee = new Employees("TESTNAME", 1, false, 1);
        Hospital underTest = new Hospital();
        underTest.addEmployee(testEmployee);
        ArrayList<Employees> retrievedEmployees = underTest.retrieveEmployeesList();
        assertEquals(1, retrievedEmployees.size());
    }


}
