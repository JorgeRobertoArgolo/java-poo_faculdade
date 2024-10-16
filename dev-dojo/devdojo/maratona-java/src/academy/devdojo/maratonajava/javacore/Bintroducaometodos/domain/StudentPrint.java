package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class StudentPrint {
    public void print(Student student){
        student.age += 5;
        System.out.println("-----------------------------");
        System.out.println("Name : " + student.name + "\nAge : " + student.age + "\nSex : " + student.sex);
    }
}
