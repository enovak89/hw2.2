public class Puf extends Hogwarts{
    private int indus;
    private int loyalty;
    private int honesty;

    public Puf(String name, int witchPower, int transgrDistance, int indus, int loyalty, int honesty) {
        super(name, witchPower, transgrDistance);
        this.indus = indus;
        this.loyalty = loyalty;
        this.honesty = honesty;
        this.faculty = "Puf";
    }

    @Override
    public void printStudent() {
        super.printStudent();
        System.out.printf(", industriousness: %d, loyalty: %d, honesty: %d", getIndus(), getLoyalty(), getHonesty());
    }

    public void comparePufStudents(Puf student) {
        if (getIndus() + getLoyalty() + getHonesty() > student.getIndus() + student.getLoyalty() + student.getHonesty()) {
            System.out.printf("%nStudent %s is better Puffends than student %s", getName(), student.getName());
        } else if (getIndus() + getLoyalty() + getHonesty() == student.getIndus() + student.getLoyalty() + student.getHonesty()) {
            System.out.printf("%nStudent %s is the same Puffends as student %s", getName(), student.getName());
        } else {
            System.out.printf("%nStudent %s is better Puffends than student %s", student.getName(), getName());
        }
    }

    public int getIndus() {
        return indus;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
}
