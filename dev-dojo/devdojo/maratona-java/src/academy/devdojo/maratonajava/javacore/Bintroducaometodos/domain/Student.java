package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Student {
    public String name;
    public int age;
    public char sex;

    public void printStudent () {
        System.out.println("-----------------------------");
        System.out.println("Name : " + this.name + "\nAge : " + this.age + "\nSex : " + this.sex);
    }
}
