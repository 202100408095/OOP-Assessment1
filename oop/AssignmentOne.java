import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        AssignmentOne assignmentOne = new AssignmentOne();

        // Part 3 – Using classes and objects
        GeneralPractitioner practitioner1 = new GeneralPractitioner(101, "practitioner1",
                "General Medicine", "Family Medicine");
        GeneralPractitioner practitioner2 = new GeneralPractitioner(102, "practitioner2",
                "General Medicine", "Internal Medicine");
        GeneralPractitioner practitioner3 = new GeneralPractitioner(103, "practitioner3",
                "General Medicine", "Pediatrics");

        Surgeon surgeon1 = new Surgeon(201, "surgeon1", "Surgery", "Orthopedic Surgery");
        Surgeon surgeon2 = new Surgeon(202, "surgeon2", "Surgery", "Neurosurgery");

        // Printing details of all health professionals
        System.out.println("Health Professional Details:");
        practitioner1.printDetails();
        practitioner2.printDetails();
        practitioner3.printDetails();
        surgeon1.printDetails();
        surgeon2.printDetails();

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        ArrayList<Appointment> appointments = new ArrayList<>();
        Appointment appointment1 = assignmentOne.createAppointment("Alice", "111111111", "08:00", practitioner1);
        if (appointment1 != null) {
            appointments.add(appointment1);
        }
        Appointment appointment2 = assignmentOne.createAppointment("Bob", "222222222", "10:00", practitioner2);
        if (appointment2 != null) {
            appointments.add(appointment2);
        }
        Appointment appointment3 = assignmentOne.createAppointment("Charlie", "333333333", "14:30", surgeon1);
        if (appointment3 != null) {
            appointments.add(appointment3);
        }
        Appointment appointment4 = assignmentOne.createAppointment("David", "444444444", "09:30", surgeon2);
        if (appointment4 != null) {
            appointments.add(appointment4);
        }

        assignmentOne.printExistingAppointments(appointments);
        assignmentOne.cancelBooking(appointments, "111111111");
        assignmentOne.printExistingAppointments(appointments);
        System.out.println("------------------------------");
    }

    public Appointment createAppointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        if (patientName == null || patientMobile == null || timeSlot == null || doctor == null) {
            System.out.println("Error: Invalid params.");
            return null;
        }

        Appointment appointment = new Appointment(patientName, patientMobile, timeSlot, doctor);
        System.out.println("Appointment Created for " + patientName);
        return appointment;
    }

    public void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
            return;
        }

        System.out.println("Existing Appointments:");
        for (Appointment appointment : appointments) {
            appointment.printAppointmentDetails();
        }
    }

    public void cancelBooking(ArrayList<Appointment> appointments, String mobile) {
        boolean exist = false;
        for (Appointment appointment : appointments) {
            if (appointment.getMobileOfPatient().equals(mobile)) {
                appointments.remove(appointment);
                System.out.println("Appointment cancelled for mobile: " + mobile);
                exist = true;
                break;
            }
        }

        if (!exist) {
            System.out.println("No appointment found with mobile: " + mobile);
        }
    }
}
