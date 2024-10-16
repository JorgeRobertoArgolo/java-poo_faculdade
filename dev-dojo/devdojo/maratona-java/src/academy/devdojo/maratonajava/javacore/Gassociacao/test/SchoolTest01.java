package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.School;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Jiraya");
        Teacher teacher2 = new Teacher("Orochimaru");
        Teacher teacher3 = new Teacher("Tsunade");
        Teacher[] teachers = new Teacher[]{teacher1, teacher2, teacher3};

        School school =  new School("Konoha");
        school.setTeachers(teachers);
        school.print();

    }
}
