public class Appointment {
    private String nameOfPatient;
    private String mobileOfPatient;
    private String timeSlot;
    private HealthProfessional doctor;

    public Appointment() {
        this(null, null, null, null);
    }

    public Appointment(String nameOfPatient, String mobileOfPatient, String timeSlot, HealthProfessional doctor) {
        this.nameOfPatient = nameOfPatient;
        this.mobileOfPatient = mobileOfPatient;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    public void printAppointmentDetails() {
        System.out.println(toString());
    }

    public String getNameOfPatient() {
        return nameOfPatient;
    }

    public String getMobileOfPatient() {
        return mobileOfPatient;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }

    @Override
    public String toString() {
        return String.format("Patient: %s, Mobile: %s, TimeSlot: %s, Doctor: %s",
                nameOfPatient, mobileOfPatient, timeSlot,
                doctor != null ? doctor.getName() : null);
    }
}
