public class Doctor {
    // Instance variables to store doctor details
    public String name;
    public String doctorID;
    public String specialization;

    // Constructor to initialize a Doctor
    public Doctor(String doctorID, String name, String specialization ) {
        this.name = name;
        this.specialization = specialization;
        this.doctorID = doctorID;
    }
}