public class HealthProfessional {
    private int id;
    private String name;
    private String specialty;

    public HealthProfessional() {
        this(-1, null, null);
    }

    public HealthProfessional(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void printDetails() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Specialty: %s",
                id, name, specialty);
    }
}
