import java.util.HashMap;


public class Hospital {
    private HashMap<Integer, Employees> employeeList = new HashMap<>();

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

    public void addPatient(Patient patient){

    }
}
