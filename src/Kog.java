public class Kog extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Kog(String name, int witchPower, int transgrDistance, int mind, int wisdom, int wit, int creation) {
        super(name, witchPower, transgrDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
        this.faculty = "Kog";
    }

    @Override
    public void printStudent() {
        super.printStudent();
        System.out.printf(", mind: %d, wisdom: %d, wit: %d, creation: %d", getMind(), getWisdom(), getWit(), getCreation());
    }

    public void compareKogStudents(Kog student) {
        if (getMind() + getWisdom() + getWit() + getCreation() > student.getMind() + student.getWisdom() + student.getWit() + student.getCreation()) {
            System.out.printf("%nStudent %s is better Kogtewrans than student %s", getName(), student.getName());
        } else if (getMind() + getWisdom() + getWit() + getCreation() == student.getMind() + student.getWisdom() + student.getWit() + student.getCreation()) {
            System.out.printf("%nStudent %s is the same Kogtewrans as student %s", getName(), student.getName());
        } else {
            System.out.printf("%nStudent %s is better Kogtewrans than student %s", student.getName(), getName());
        }
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }
}
