public class Surgeon extends HealthProfessional {
    private String surgicalSpecialty;

    public Surgeon() {
        super();
        this.surgicalSpecialty = "Surgery";
    }

    public Surgeon(int id, String name, String specialty, String surgicalSpecialty) {
        super(id, name, specialty);
        this.surgicalSpecialty = surgicalSpecialty;
    }

    @Override
    public void printDetails() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + ", Surgical Specialty: " + surgicalSpecialty;
    }
}
