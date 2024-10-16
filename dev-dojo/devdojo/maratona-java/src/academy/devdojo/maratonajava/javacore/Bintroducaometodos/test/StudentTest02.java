package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Roberto";
        student01.age = 20;
        student01.sex = 'M';

        student01.printStudent();

        student02.name = "Riquelme";
        student02.age = 15;
        student02.sex = 'M';

        student02.printStudent();
    }
}
