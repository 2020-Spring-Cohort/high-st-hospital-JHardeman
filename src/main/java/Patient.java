public class Patient {
    private String Name;
    private int Blood_Level = 20;
    private int Health_Level = 10;

    public Patient(String name, int Blood_Level, int Health_Level) {
        this.Name = name;
        this.Blood_Level = Blood_Level;
        this.Health_Level = Health_Level;
    }


    public String getName() {
        return Name;
    }

    public int getBlood_Level() {
        return Blood_Level;
    }

    public int getHealth_Level() {
        return Health_Level;

    }

    public void tickPatient() {
        Health_Level -= 2;
        Blood_Level -= 1;

    }

    public void NurseHeal() {
        Health_Level += 4;
    }

    public void NurseDrawBlood() {
        Blood_Level -= 4;
    }

    public void NurseGiveBlood() {
        Blood_Level += 4;
    }

    public void DoctorHeal() {
        Health_Level += 4;
    }

    public void DoctorDrawBlood() {
        Blood_Level -= 4;
    }

    public void DoctorGiveBlood() {
        Blood_Level += 4;
    }

    @Override
    public String toString() {
        return "Name=" + Name
                + ", Health_Level=" + Health_Level +
                ", Blood_Level=" + Blood_Level;
    }



}
