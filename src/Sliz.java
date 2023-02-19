public class Sliz extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resource;
    private int lust;

    public Sliz(String name, int witchPower, int transgrDistance, int cunning, int determination, int ambition, int resource, int lust) {
        super(name, witchPower, transgrDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resource = resource;
        this.lust = lust;
        this.faculty = "Sliz";
    }

    @Override
    public void printStudent() {
        super.printStudent();
        System.out.printf(", cunnuing: %d, determination: %d, ambition: %d, resource: %d, lust: %d", getCunning(), getDetermination(),
                getAmbition(), getResource(), getLust());
    }

    public void compareSlizStudents(Sliz student) {
        if (getCunning() + getDetermination() + getAmbition() + getResource() + getLust() > student.getCunning() +
                student.getDetermination() + student.getAmbition() + student.getResource() + student.getLust()) {
            System.out.printf("%nStudent %s is better Slizerin than student %s", getName(), student.getName());
        } else if (getCunning() + getDetermination() + getAmbition() + getResource() + getLust() == student.getCunning() +
                student.getDetermination() + student.getAmbition() + student.getResource() + student.getLust()) {
            System.out.printf("%nStudent %s is the same Slizerin as student %s", getName(), student.getName());
        } else {
            System.out.printf("%nStudent %s is better Slizerin than student %s", student.getName(), getName());
        }
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResource() {
        return resource;
    }

    public int getLust() {
        return lust;
    }
}
