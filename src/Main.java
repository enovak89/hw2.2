public class Main {
    public static void main(String[] args) {

        Grif harry = new Grif("H", 10, 12, 20, 30, 40);
        Grif ron = new Grif("R", 40, 20, 30, 30, 40);


        harry.printStudent();
        ron.printStudent();
        harry.compareHogwartsStudents(ron);
        ron.compareHogwartsStudents(harry);


    }

}