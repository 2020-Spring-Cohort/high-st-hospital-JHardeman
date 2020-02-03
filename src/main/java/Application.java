import java.util.Scanner;

public class Application {

    public static Scanner input = new Scanner(System.in);
    public static Hospital hospital = new Hospital();

    public static void main(String[] args) {
        Employees doctor = new Doctor("Hannibal Lecter", 1777, false, 90000, "Surgeon");
        Employees nurse = new Nurse("Ratched", 1987, false, 50000);
        Employees receptionist = new Receptionist("Deb", 1957, 45000, false, false);
        Employees janitor = new Janitor("Fred", 1942, false, 40000, false);

        Patient patient1 = new Patient("Zero", 20, 10);


        hospital.addEmployee(doctor);
        hospital.addEmployee(nurse);
        hospital.addEmployee(receptionist);
        hospital.addEmployee(janitor);
        hospital.addPatient(patient1);


        System.out.println("Welcome to High Street Hospital. \n ");


        int yourChoice = 1;
        while (yourChoice != 0) {

            System.out.println("What would you like to do today? Enter the corresponding integer:\n" +
                    "[1] Pay all employees? "+  "                             "  + "[2] Treat a patient? \n"+
                    "[3] Take a patient's blood sample? "+  "                 "  + "[4] Have Fred sweep/stop sweeping the hospital ? \n" +
                    "[5] Have Deb answer/get off the phone? " +  "             "  + "[6] Display employee information? \n" +
                    "[7] Check patient stats\n" +
                    "[0] Exit");

            yourChoice = input.nextInt();
        }

        switch (yourChoice) {
            case 1:
                hospital.payEmployees();
                System.out.println(" Everyone has been paid for their hard work!");
                break;
        }
    }
}
