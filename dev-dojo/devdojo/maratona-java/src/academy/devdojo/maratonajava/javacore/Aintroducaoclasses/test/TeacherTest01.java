package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Teacher;

public class TeacherTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Igo";
        teacher.age = 30;
        teacher.sex = 'M';

        System.out.println("Teacher's name : " + teacher.name + "\nAge : " + teacher.age + "\nSex : " + teacher.sex);
    }
}
