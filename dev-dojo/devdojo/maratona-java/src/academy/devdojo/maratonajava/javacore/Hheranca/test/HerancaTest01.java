package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Address;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Person;

public class HerancaTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Street 3");
        address.setCep("44900-000");

        Person person = new Person();
        person.setName("Jiraya");
        person.setCpf("11111111111");
        person.setAddress(address);

        person.print();
    }
}
