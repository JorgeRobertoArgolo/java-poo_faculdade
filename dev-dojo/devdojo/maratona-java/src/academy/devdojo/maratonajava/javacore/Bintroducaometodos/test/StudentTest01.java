package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Student;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.StudentPrint;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        StudentPrint printer = new StudentPrint();

        student01.name = "Jorge";
        student01.age = 20;
        student01.sex = 'M';

        student02.name = "Riquelme";
        student02.age = 15;
        student02.sex = 'M';

        printer.print(student01);
        printer.print(student02);

        printer.print(student01);
        printer.print(student02);
    }
}
