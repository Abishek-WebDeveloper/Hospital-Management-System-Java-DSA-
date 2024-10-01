import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) { mainMenu();}
    /** Displays the main menu of the hospital system and prompts the user to select an option **/
    public static Scanner scanner = new Scanner(System.in);
    public static void mainMenu(){
        System.out.println("\n========== Welcome to Arogya Hospital ==========\n");
        System.out.println("Please select an option:");
        System.out.println("1. Admin");
        System.out.println("2. Patient");
        System.out.println("3. Doctor");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        try {
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    adminLogin();
                    break;
                case 2:
                    patientLogin();
                    break;
                case 3:
                    doctorLogin();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid response... please select an option");
                    mainMenu();}}
        catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.next(); // Consume the invalid input
            mainMenu();}
    }
    /** Handles the admin login functionality. **/
    public static void adminLogin() {
        System.out.println("Admin Login");
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();
        // Validate username and password
        if (username.equals("ADMIN") && password.equals("HOSPITALADMIN")) {
            System.out.println("Login successful. Welcome, Admin!");
            Operations.performAdminOperations();
        } else {
            System.out.println("Invalid username or password. Please try again.");
            mainMenu(); // Return to the main menu
        }
    }

    /** Handles the patient login functionality. **/
    public static void patientLogin() {
        System.out.println("Patient Login");
        System.out.println("If you are not registered, please type PATIENT as username and 123 as the password");
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();
        // Validate username and password
        if (username.equals("PATIENT") && password.equals("123")) {
            System.out.println("Login successful. Welcome, Patient!");
            Operations.performPatientOperations();
        } else {
            System.out.println("Invalid username or password. Please try again.");
            mainMenu(); // Return to the main menu
        }
    }

    /** Handles the doctor login functionality. **/
    public static void doctorLogin() {
        System.out.println("Doctor Login");
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        // Validate username and password
        if (username.equals("DOCTOR") && password.equals("DOCTOR123")) {
            System.out.println("Login successful. Welcome, Doctor!");
            Operations.performDoctorOperations();
        } else {
            System.out.println("Invalid username or password. Please try again.");
            mainMenu(); // Return to the main menu
        }
    }
}