import java.util.Scanner;

public class Operations {
    private static final AdminLinkedList adminlinkedlist = new AdminLinkedList();
    private static final Scanner scanner = new Scanner(System.in);
    public static void performAdminOperations() {
        while (true) {
            System.out.println("\n========== Admin Dashboard ==========");
            System.out.println("Please select an option:");
            System.out.println("1. Insert Patient");
            System.out.println("2. Delete Patient");
            System.out.println("3. Update Patient");
            System.out.println("4. View Patients");
            System.out.println("5. Search Patient");
            System.out.println("6. Insert Appointment");
            System.out.println("7. Delete Appointment");
            System.out.println("8. Update Appointment");
            System.out.println("9. View Appointments");
            System.out.println("10. Search Appointment");
            System.out.println("11. Insert Doctor");
            System.out.println("12. Delete Doctor");
            System.out.println("13. Update Doctor");
            System.out.println("14. View Doctors");
            System.out.println("15. Search Doctor");
            System.out.println("16. Logout");
            System.out.println("17. Exit to Main Menu");
            System.out.print("Enter your choice: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (option) {
                case 1:
                    insertPatient();
                    break;
                case 2:
                    deletePatient();
                    break;
                case 3:
                    updatePatient();
                    break;
                case 4:
                    viewPatient();
                    break;
                case 5:
                    searchPatient();
                    break;
                case 6:
                    insertAppointment();
                    break;
                case 7:
                    deleteAppointment();
                    break;
                case 8:
                    updateAppointment();
                    break;
                case 9:
                    viewAppointmentsadmin();
                    break;
                case 10:
                    searchAppointment();
                    break;
                case 11:
                    insertDoctor();
                    break;
                case 12:
                    deleteDoctor();
                    break;
                case 13:
                    updateDoctor();
                    break;
                case 14:
                    viewDoctors();
                    break;
                case 15:
                    searchDoctor();
                    break;
                case 16:
                    System.out.println("Logged out successfully.");
                    Main.mainMenu(); // Return to the main menu
                    break;
                case 17:
                    System.out.println("Exit from the system");
                    System.exit(0); // Exit the program
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    performAdminOperations();
            }
        }
    }
    public static void performDoctorOperations() {
        while (true) {
            System.out.println("\n========== Doctor Dashboard ==========");
            System.out.println("Please select an option:");
            System.out.println("1. View Patients");
            System.out.println("2. View Appointments");
            System.out.println("3. Logout");
            System.out.println("4. Exit to Main Menu");
            System.out.print("Enter your choice: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (option) {
                case 1:
                    adminlinkedlist.viewPatients();
                    break;
                case 2:
                    adminlinkedlist.viewAppointments();
                    break;
                case 3:
                    System.out.println("Logged out successfully.");
                    Main.mainMenu(); // Return to the main menu
                    break;
                case 4:
                    System.out.println("Exit from the system");
                    System.exit(0); // Exit the program
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    performDoctorOperations();
            }
        }
    }
    public static void performPatientOperations() {
        while (true) {
            System.out.println("\n========== Patient Dashboard ==========");
            System.out.println("Please select an option:");
            System.out.println("1. Register as Patient");
            System.out.println("2. Add Appointment");
            System.out.println("3. View Doctors");
            System.out.println("4. Logout");
            System.out.println("5. Exit to Main Menu");
            System.out.print("Enter your choice: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (option) {
                case 1:
                    registerAsPatient();
                    break;
                case 2:
                    addAppointment();
                    break;
                case 3:
                    adminlinkedlist.viewDoctors();
                    break;
                case 4:
                    System.out.println("Logged out successfully.");
                    Main.mainMenu(); // Return to the main menu
                    break;
                case 5:
                    System.out.println("Exit from the system");
                    System.exit(0); // Exit the program
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }


    // PATIENT SECTION //
    private static void insertPatient() {
        System.out.println("\n========== Insert Patient ==========");
        // Get patient details from user
        System.out.print("Enter patient ID: ");
        String patientID = scanner.nextLine();
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter patient age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter patient disease: ");
        String disease = scanner.nextLine();

        // Create a new patient object
        Patient patient = new Patient(patientID, name, age, disease);

        // Insert the patient into the linked list
        adminlinkedlist.insertPatient(patient);
    }
    private static void deletePatient() {
        System.out.println("\n========== Delete Patient ==========");
        // Get patient ID from user
        System.out.print("Enter patient ID: ");
        String patientID = scanner.nextLine();

        // Delete the patient from the linked list
        adminlinkedlist.deletePatient(patientID);
    }
    private static void updatePatient() {
        System.out.println("\n========== Update Patient ==========");
        // Get patient details from user
        System.out.print("Enter patient ID: ");
        String patientID = scanner.nextLine();
        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter new disease: ");
        String disease = scanner.nextLine();

        // Update the patient in the linked list
        adminlinkedlist.updatePatient(patientID, name, age, disease);
    }
    private static void viewPatient() {
        System.out.println("\n========== View Patients ==========");
        // View all patients in the linked list
        adminlinkedlist.viewPatients();
    }
    private static void searchPatient() {
        System.out.println("\n========== Search Patient ==========");
        // Get patient ID from user
        System.out.print("Enter patient ID: ");
        String patientID = scanner.nextLine();

        // Search for the patient in the linked list
        adminlinkedlist.searchPatient(patientID);
    }

    // APPOINTMENT SECTION //

    private static void insertAppointment() {
        System.out.println("\n========== Insert Appointment ==========");
        // Get appointment details from user
        System.out.print("Enter appointment ID: ");
        String appointmentID = scanner.nextLine();
        System.out.print("Enter patient name: ");
        String patientname = scanner.nextLine();
        System.out.print("Enter doctor name: ");
        String doctorName = scanner.nextLine();
        System.out.print("Enter appointment date: ");
        String date = scanner.nextLine();
        System.out.print("Enter appointment time: ");
        String time = scanner.nextLine();
        System.out.print("Enter disease: ");
        String disease = scanner.nextLine();
        // Create a new appointment object
        Appointment appointment = new Appointment(appointmentID,patientname, doctorName, date, time, disease); // Update the Appointment constructor accordingly
        // Insert the appointment into the linked list
        adminlinkedlist.insertAppointment(appointment);
    }
    private static void deleteAppointment() {
        System.out.println("\n========== Delete Appointment ==========");
        // Get appointment ID from user
        System.out.print("Enter appointment ID: ");
        String appointmentID = scanner.nextLine();

        // Delete the appointment from the linked list
        adminlinkedlist.deleteAppointment(appointmentID);
    }
    private static void updateAppointment() {
        System.out.println("\n========== Update Appointment ==========");
        // Get appointment details from user
        System.out.print("Enter appointment ID: ");
        String appointmentID = scanner.nextLine();
        System.out.print("Enter new appointment date: ");
        String newDate = scanner.nextLine();
        System.out.print("Enter new appointment time: ");
        String newTime = scanner.nextLine();
        System.out.print("Enter new doctor name: ");
        String newDoctor = scanner.nextLine();
        // Update the appointment in the linked list
        adminlinkedlist.updateAppointment(appointmentID, newDate, newTime, newDoctor);
    }
    private static void viewAppointmentsadmin() {
        System.out.println("\n========== View Appointments ==========");
        // View all appointments in the linked list
        adminlinkedlist.viewAppointments();
    }
    private static void searchAppointment() {
        System.out.println("\n========== Search Appointment ==========");
        // Get appointment ID from user
        System.out.print("Enter appointment ID: ");
        String appointmentID = scanner.nextLine();

        // Search for the appointment in the linked list
        adminlinkedlist.searchAppointment(appointmentID);
    }
    // DOCTOR SECTION //
    private static void insertDoctor() {
        System.out.println("\n========== Insert Doctor ==========");
        // Get doctor details from user
        System.out.print("Enter doctor ID: ");
        String doctorID = scanner.nextLine();
        System.out.print("Enter doctor name: ");
        String name = scanner.nextLine();
        System.out.print("Enter doctor specialization: ");
        String specialization = scanner.nextLine();

        // Create a new doctor object
        Doctor doctor = new Doctor(doctorID, name, specialization);

        // Insert the doctor into the linked list
        adminlinkedlist.insertDoctor(doctor);
    }
    private static void deleteDoctor() {
        System.out.println("\n========== Delete Doctor ==========");
        // Get doctor ID from user
        System.out.print("Enter doctor ID: ");
        String doctorID = scanner.nextLine();

        // Delete the doctor from the linked list
        adminlinkedlist.deleteDoctor(doctorID);
    }
    private static void updateDoctor() {
        System.out.println("\n========== Update Doctor ==========");
        // Get doctor details from user
        System.out.print("Enter doctor ID: ");
        String doctorID = scanner.nextLine();
        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new specialization: ");
        String specialization = scanner.nextLine();

        // Update the doctor in the linked list
        adminlinkedlist.updateDoctor(doctorID, name, specialization);
    }
    private static void viewDoctors() {
        System.out.println("\n========== View Doctors ==========");
        // View all doctors in the linked list
        adminlinkedlist.viewDoctors();
    }
    private static void searchDoctor() {
        System.out.println("\n========== Search Doctor ==========");
        // Get doctor ID from user
        System.out.print("Enter doctor ID: ");
        String doctorID = scanner.nextLine();

        // Search for the doctor in the linked list
        adminlinkedlist.searchDoctor(doctorID);
    }
    private static void registerAsPatient() {
        System.out.println("\n========== Register as Patient ==========");
        // Get patient details from user
        System.out.print("Enter your patient ID: ");
        String patientID = scanner.nextLine();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter your disease: ");
        String disease = scanner.nextLine();

        // Create a new patient object
        Patient patient = new Patient(patientID, name, age, disease);
        adminlinkedlist.insertPatient(patient);
        System.out.println("Registration successful.");
        // Exit to the dashboard
    }
    private static void addAppointment() {
        System.out.println("\n========== Add Appointment ==========");
        // Get appointment details from user
        System.out.print("Enter your appointment ID: ");
        String appointmentID = scanner.nextLine();
        System.out.print("Enter your name: ");
        String patientName = scanner.nextLine();
        System.out.print("Enter doctor name: ");
        String doctorName = scanner.nextLine();
        System.out.print("Enter appointment date: ");
        String date = scanner.nextLine();
        System.out.print("Enter appointment time: ");
        String time = scanner.nextLine();
        System.out.print("Enter your disease: ");
        String disease = scanner.nextLine();

        // Create a new appointment object
        Appointment appointment = new Appointment(appointmentID, patientName, doctorName, date, time, disease);
        adminlinkedlist.insertAppointment(appointment);
        System.out.println("Appointment added successfully.");
        // Exit to the dashboard
    }
}