import java.util.ArrayList;
import java.util.HashMap;


public class Hospital {
    private HashMap<Integer, Employees> employeeList = new HashMap<>();
    private HashMap<String, Patient> patientList = new HashMap<>();
    ArrayList<Patient> retrievedPatientList = new ArrayList<>();


    public HashMap<Integer, Employees> getEmployeeList() {
        return employeeList;
    }

    public void addEmployeesToList(Employees testEmployees){
        employeeList.put(testEmployees.getIDNumber(), testEmployees);
    }

    public int size() {
        return employeeList.size();
    }

    public void payEmployees() {
        for (Employees employeeToBePaid : employeeList.values()) {
            employeeToBePaid.receiveSalary();
        }

    }

    @Override
    public String toString() {
        return "Hospital{" +
                "employeeList=" + employeeList +
                '}';
    }

    public void addEmployee(Employees doctor) {
    }

    public void addPatient(Patient testPatient){
        patientList.put(testPatient.getName(), testPatient);

    }

    public ArrayList<Patient> retrievePatientList() {
        retrievedPatientList = new ArrayList<>(patientList.values());
        return retrievedPatientList;
    }

    public ArrayList<Employees> retrieveEmployeesList() {
        return new ArrayList<>(employeeList.values());
    }






}
