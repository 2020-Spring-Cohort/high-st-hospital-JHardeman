public class Doctor extends Employees implements MedicalLicense {

    private final String specialty;

    public Doctor(String Name, int idNumber, boolean isPaid, int salary, String specialty) {
        super(Name, idNumber, isPaid, salary);
        this.specialty = specialty;

    }

    public String getSpecialty() {
        return specialty;
    }


    @Override
    public void drawblood(Patient testPatient) {

    }

    @Override
    public void healPatient(Patient testPatient) {

    }

    @Override
    public void giveblood(Patient testPatient) {

    }

}
