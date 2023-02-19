public abstract class Hogwarts {
    private final int witchPower;
    private final int transgrDistance;
    private final String name;
    String faculty;

    public Hogwarts(String name, int witchPower, int transgrDistance) {
        this.name = name;
        this.witchPower = witchPower;
        this.transgrDistance = transgrDistance;
    }

    public void printStudent() {
        System.out.printf("%nStudent information%nname: %s, faculty: %s, witch power: %d, trans distance: %d", getName(), getFaculty(), getWitchPower(), getTransgrDistance());
    }

    public int sumSkills() {
        return getTransgrDistance() + getWitchPower();
    }
    public void compare(Hogwarts student) {
        if (sumSkills() > student.sumSkills()) {
            System.out.printf("%nHogwarts student %s is better than student %s", getName(), student.getName());
        }
        else if (sumSkills() == student.sumSkills()) {
            System.out.printf("%nHogwarts student %s is the same as student %s", getName(), student.getName());
        } else {
            System.out.printf("%nHogwarts student %s is better than student %s", student.getName(), getName());
        }
    }

    public String getName() {
        return name;
    }

    public int getWitchPower() {
        return witchPower;
    }

    public int getTransgrDistance() {
        return transgrDistance;
    }

    public String getFaculty() {
        return faculty;
    }
}
