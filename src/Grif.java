public class Grif extends Hogwarts{
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Grif(String name, int witchPower, int transgrDistance, int nobility, int honor, int bravery) {
        super(name, witchPower, transgrDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        this.faculty = "Grif";
    }

    @Override
    public void printStudent() {
        super.printStudent();
        System.out.printf(", nobility: %d, honor: %d, bravery: %d", getNobility(), getHonor(), getBravery());
    }

    @Override
    public int sumSkills() {
        return super.sumSkills() + getNobility() + getHonor() + getBravery();
    }

    public void compare(Grif student) {
        if (sumSkills() > student.sumSkills()) {
            System.out.printf("%nStudent %s is better Griffindors than student %s", getName(), student.getName());
        } else if (sumSkills() == student.sumSkills()) {
            System.out.printf("%nStudent %s is the same Griffindors as student %s", getName(), student.getName());
        } else {
            System.out.printf("%nStudent %s is better Griffindors than student %s", student.getName(), getName());
        }
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
}
