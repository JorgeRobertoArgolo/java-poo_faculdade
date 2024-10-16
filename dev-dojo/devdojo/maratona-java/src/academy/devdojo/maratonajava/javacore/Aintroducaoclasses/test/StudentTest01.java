package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Jorge Roberto";
        student.age = 20;
        student.sex = 'M';
        System.out.println("Name : " + student.name);
        System.out.println("Age : " + student.age);
        System.out.println("Sex : " + student.sex);
        System.out.println(student);
    }
}
