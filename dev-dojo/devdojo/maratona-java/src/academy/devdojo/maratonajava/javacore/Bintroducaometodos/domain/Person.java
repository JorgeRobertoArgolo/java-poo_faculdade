package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Person {
    private String name;
    private int age;

    public void printer() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public int getAge () {
        return this.age;
    }
}
