import java.util.ArrayList;
import java.util.HashMap;

public class Nurse extends Employees implements MedicalLicense{
    HashMap<Integer, Patient> patientsList = new HashMap<>();


    public Nurse (String name, int IDNumber, boolean isPaid, int salary){
        super(name, IDNumber, isPaid, salary);
    }

    public int paySalary() {
        return 50000;
    }

    @Override
    public void drawblood(Patient testPatient) {
        testPatient.NurseDrawBlood();

    }

    @Override
    public void healPatient(Patient testPatient) {
        testPatient.NurseHeal();

    }

    @Override
    public void giveblood(Patient testPatient) {
        testPatient.NurseGiveBlood();
    }

    @Override
    public String toString() {
        return "Position= nurse, name= " + getName()
                + ", ID Number= " + getIDNumber()
                + ", salary= " + paySalary()
                + ", is paid= " + getIsPaid();
    }


}