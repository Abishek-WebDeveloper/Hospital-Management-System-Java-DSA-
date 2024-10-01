class AdminLinkedList {
    private Node head; // Head node of the linked list
    private AppointmentNode appointmentHead; // Head node of the linked list for appointments
    private DoctorNode doctorHead; // Head node of the linked list for doctors
    // Inner class representing a node in the linked list
    private class Node {
        Patient patient; // Patient object
        Node next; // Reference to the next node

        // Constructor to initialize a node
        public Node(Patient patient) {
            this.patient = patient;
            this.next = null;
        }
    }
    // Inner class representing a node in the linked list for appointments
    private class AppointmentNode {
        Appointment appointment; // Appointment object
        AppointmentNode next; // Reference to the next node

        // Constructor to initialize a node
        public AppointmentNode(Appointment appointment) {
            this.appointment = appointment;
            this.next = null;
        }
    }
    // Inner class representing a node in the linked list for doctors
    private class DoctorNode {
        Doctor doctor; // Doctor object
        DoctorNode next; // Reference to the next node

        // Constructor to initialize a node
        public DoctorNode(Doctor doctor) {
            this.doctor = doctor;
            this.next = null;
        }
    }
    // Method to insert a patient into the linked list
    public void insertPatient(Patient patient) {
        Node newNode = new Node(patient);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Patient inserted successfully.");
    }
    // Method to delete a patient from the linked list
    public void deletePatient(String patientID) {
        if (head == null) {
            System.out.println("Empty.");
            return;
        }
        if (head.patient.patientID.equals(patientID)) {
            head = head.next;
            System.out.println("Patient deleted successfully.");
            return;
        }
        Node current = head;
        Node previous = null;
        while (current != null && !current.patient.patientID.equals(patientID)) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Patient not found.");
            return;
        }
        previous.next = current.next;
        System.out.println("Patient deleted successfully.");
    }
    // Method to update a patient in the linked list
    public void updatePatient(String patientID, String newName, int newAge, String newDisease) {
        Node current = head;
        while (current != null && !current.patient.patientID.equals(patientID)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Patient not found.");
            return;
        }
        current.patient.name = newName;
        current.patient.age = newAge;
        current.patient.disease = newDisease;
        System.out.println("Patient updated successfully.");
    }
    // Method to view all patients in the linked list
    public void viewPatients() {
        if (head == null) {
            System.out.println("Empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println("Patient ID: " + current.patient.patientID);
            System.out.println("Name: " + current.patient.name);
            System.out.println("Age: " + current.patient.age);
            System.out.println("Disease: " + current.patient.disease);
            System.out.println("---------------------");
            current = current.next;
        }
    }
    // Method to search for a patient in the linked list
    public void searchPatient(String patientID) {
        Node current = head;
        while (current != null && !current.patient.patientID.equals(patientID)) {
            current = current.next;}
        if (current == null) {
            System.out.println("Patient not found.");
            return; }
        System.out.println("Patient ID: " + current.patient.patientID);
        System.out.println("Name: " + current.patient.name);
        System.out.println("Age: " + current.patient.age);
        System.out.println("Disease: " + current.patient.disease);
    }
    // Method to insert an appointment into the linked list
    public void insertAppointment(Appointment appointment) {
        AppointmentNode newNode = new AppointmentNode(appointment);
        if (appointmentHead == null) {
            appointmentHead = newNode;
        } else {
            AppointmentNode current = appointmentHead;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Appointment inserted successfully.");
    }
    // Method to delete an appointment from the linked list
    public void deleteAppointment(String appointmentID) {
        if (appointmentHead == null) {
            System.out.println("Empty.");
            return;}
        if (appointmentHead.appointment.appointmentID.equals(appointmentID)) {
            appointmentHead = appointmentHead.next;
            System.out.println("Appointment deleted successfully.");
            return;}
        AppointmentNode current= appointmentHead;
        AppointmentNode previous = null;
        while (current != null && !current.appointment.appointmentID.equals(appointmentID)) {
            previous = current;
            current = current.next;}
        if (current == null) {
            System.out.println("Appointment not found.");
            return;}
        previous.next = current.next;
        System.out.println("Appointment deleted successfully.");
    }
    // Method to update an appointment in the linked list
    public void updateAppointment(String appointmentID, String newDate, String newTime, String newDoctor) {
        AppointmentNode current = appointmentHead;
        while (current != null && !current.appointment.appointmentID.equals(appointmentID)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Appointment not found.");
            return;
        }
        current.appointment.date = newDate;
        current.appointment.time = newTime;
        current.appointment.doctor = newDoctor;
        System.out.println("Appointment updated successfully.");
    }
    // Method to view all appointments in the linked list
    public void viewAppointments() {
        if (appointmentHead == null) {
            System.out.println("Empty.");
            return;
        }
        AppointmentNode current = appointmentHead;
        while (current != null) {
            System.out.println("Appointment ID: " + current.appointment.appointmentID);
            System.out.println("Date: " + current.appointment.date);
            System.out.println("Time: " + current.appointment.time);
            System.out.println("Doctor: " + current.appointment.doctor);
            System.out.println("Disease: " + current.appointment.disease);
            System.out.println("---------------------");
            current = current.next;
        }
    }
    // Method to search for an appointment in the linked list
    public void searchAppointment(String appointmentID) {
        AppointmentNode current = appointmentHead;
        while (current != null && !current.appointment.appointmentID.equals(appointmentID)) {
            current = current.next; }
        if (current == null) {
            System.out.println("Appointment not found.");
            return; }
        System.out.println("Appointment ID: " + current.appointment.appointmentID);
        System.out.println("Date: " + current.appointment.date);
        System.out.println("Time: " + current.appointment.time);
        System.out.println("Doctor: " + current.appointment.doctor);
    }
    // Method to insert a doctor into the linked list
    public void insertDoctor(Doctor doctor) {
        DoctorNode newNode = new DoctorNode(doctor);
        if (doctorHead == null) {
            doctorHead = newNode;
        } else {
            DoctorNode current = doctorHead;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Doctor inserted successfully.");
    }
    // Method to delete a doctor from the linked list
    public void deleteDoctor(String doctorID) {
        if (doctorHead == null) {
            System.out.println("Empty.");
            return;
        }
        if (doctorHead.doctor.doctorID.equals(doctorID)) {
            doctorHead = doctorHead.next;
            System.out.println("Doctor deleted successfully.");
            return;
        }
        DoctorNode current = doctorHead;
        DoctorNode previous = null;
        while (current != null && !current.doctor.doctorID.equals(doctorID)) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Doctor not found.");
            return;
        }
        previous.next = current.next;
        System.out.println("Doctor deleted successfully.");
    }
    // Method to update a doctor in the linked list
    public void updateDoctor(String doctorID, String newName, String newSpecialization) {
        DoctorNode current = doctorHead;
        while (current != null && !current.doctor.doctorID.equals(doctorID)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Doctor not found.");
            return;
        }
        current.doctor.name = newName;
        current.doctor.specialization = newSpecialization;
        System.out.println("Doctor updated successfully.");
    }
    // Method to view all doctors in the linked list
    public void viewDoctors() {
        if (doctorHead == null) {
            System.out.println("Empty.");
            return;
        }
        DoctorNode current = doctorHead;
        System.out.println("Doctors:");
        while (current != null) {
            System.out.println("Doctor ID: " + current.doctor.doctorID);
            System.out.println("Name: " + current.doctor.name);
            System.out.println("Specialization: " + current.doctor.specialization);
            System.out.println();
            current = current.next;
        }
    }
    // Method to search for a doctor in the linked list
    public void searchDoctor(String doctorID) {
        DoctorNode current = doctorHead;
        while (current != null && !current.doctor.doctorID.equals(doctorID)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Doctor not found.");
            return;
        }
        System.out.println("Doctor ID: " + current.doctor.doctorID);
        System.out.println("Name: " + current.doctor.name);
        System.out.println("Specialization: " + current.doctor.specialization);
    }
}

