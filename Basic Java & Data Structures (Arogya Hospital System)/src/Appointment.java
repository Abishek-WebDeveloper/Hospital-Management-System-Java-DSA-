// Appointment class
class Appointment {
    public String appointmentID;
    public String doctor;
    public String patientname;
    public String date;
    public String time;
    public String disease;

    // Constructor
    public Appointment(String appointmentID, String patientname, String doctor, String date, String time, String disease) {
        this.appointmentID = appointmentID;
        this.patientname = patientname;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
        this.disease = disease;

    }
}