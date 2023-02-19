public class Main {
    public static void main(String[] args) {

        Grif harry = new Grif("Harry", 10, 12, 20, 30, 40);
        Grif ron = new Grif("Ron", 40, 20, 30, 30, 40);
        Grif germiona = new Grif("Germiona", 50, 3, 3, 3, 30);
        Puf zaharia = new Puf("Zaharia", 10, 10, 5, 5, 5);
        Puf sedrik = new Puf("Sedrik", 20, 30, 51, 15, 4);
        Puf jastin = new Puf("Jastin", 25, 3, 21, 41, 5);
        Kog chang = new Kog("Chang", 32, 10, 5, 5, 1, 32);
        Kog padme = new Kog("Padme", 32, 10, 5, 5, 32, 1);
        Kog marcus = new Kog("Marcus", 42, 10, 5, 54, 22, 13);
        Sliz drako = new Sliz("Drako", 42, 10, 5, 54, 22, 13, 5);
        Sliz graham = new Sliz("Graham", 12, 20, 53, 5, 12, 23, 53);
        Sliz gregor = new Sliz("Gregory", 2, 23, 3, 51, 22, 3, 33);


        harry.printStudent();
        jastin.printStudent();
        marcus.printStudent();
        drako.printStudent();
        marcus.compareHogwartsStudents(drako);
        ron.compareGrifStudents(germiona);
        zaharia.comparePufStudents(sedrik);
        chang.compareKogStudents(padme);
        gregor.compareSlizStudents(drako);


    }

}