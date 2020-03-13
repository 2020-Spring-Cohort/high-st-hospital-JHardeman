public class Employees {
    private String name;
    private int idNumber;
    private boolean isPaid;
    public int salary;


    public Employees(String name, int idNumber, boolean isPaid, int salary) {
        this.name = name;
        this.idNumber = idNumber;
        this.isPaid = isPaid;
        this.salary = salary;
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

    public int getIDNumber() {
        return idNumber;
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
