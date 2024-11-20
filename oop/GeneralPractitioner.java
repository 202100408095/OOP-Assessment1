public class GeneralPractitioner extends HealthProfessional {
    private String typeOfPractice;

    public GeneralPractitioner() {
        super();
        this.typeOfPractice = "Medicine";
    }

    public GeneralPractitioner(int id, String name, String specialty, String typeOfPractice) {
        super(id, name, specialty);
        this.typeOfPractice = typeOfPractice;
    }

    public String getTypeOfPractice() {
        return typeOfPractice;
    }

    @Override
    public void printDetails() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + ", Type of Practice: " + typeOfPractice;
    }
}
