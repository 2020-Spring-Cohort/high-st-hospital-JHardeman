public class Employees {
    private String name;
    int idNumber;
    private boolean isPaid;
    public int salary;


    public Employees(String name, int idNumber, boolean isPaid, int salary) {
        this.name = name;
        this.idNumber = idNumber;
        this.isPaid = isPaid;
        this.salary = salary;
    }

    public Employees(String testName, int i, boolean b) {
    }

    public boolean getIsPaid() {
        return isPaid;
    }


    public String getName() {
        return name;
    }

    public int getSalary() {
        return 0;
    }

    public String getIDNumber() {
        return String.valueOf(idNumber);
    }


    public void receiveSalary() {
        isPaid = true;

    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }


}
