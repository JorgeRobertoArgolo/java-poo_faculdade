package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;


import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        /*
        person.name = "Jiraya";
        person.age = 70;
        */
        person.setName("Jiraya");
        person.setAge(70);

        person.printer();
        System.out.println("----------------------------");
        System.out.println("Name : " + person.getName());
        System.out.println("Age : " + person.getAge());
    }
}
