public class Receptionist extends Employees {
    private boolean onPhone;


    public Receptionist(String name, int IDNumber, int salary, boolean isPaid, boolean onPhone) {
        super(name, IDNumber, isPaid, salary);
        this.onPhone = onPhone;
    }


    public int paySalary() {
        return 45000;
    }

    @Override
    public String toString() {
        return "Position= receptionist, name= " + getName()
                + ", ID Number= " + getIDNumber()
                + ", on phone= " + onPhone
                + ", salary= " + paySalary()
                + ", is paid= " + getIsPaid();
    }
}