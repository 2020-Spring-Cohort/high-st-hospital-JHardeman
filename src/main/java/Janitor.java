public class Janitor extends Employees {
    private boolean isSweeping;

    public Janitor(String name, int IDNumber, boolean isPaid, int salary, boolean isSweeping) {
        super(name, IDNumber, isPaid, salary);
        this.isSweeping = isSweeping;
    }

    public boolean getIsSweeping() {
        return isSweeping;
    }

    public int paySalary() {
        return 40000;
    }

    @Override
    public String toString() {
        return "Position= janitor, name= " + getName()
                + ", ID Number= " + getIDNumber()
                + ", isSweeping= " + isSweeping
                + ", salary= " + paySalary()
                + ", is paid= " + getIsPaid();
    }

    public void Sweep() {
        isSweeping = true;
    }
}