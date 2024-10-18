package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Person {
    private String name;
    private String cpf;
    private Address address;

    public void print () {
        System.out.println("Name : " + getName());
        System.out.println("CPF : " + getCpf());
        System.out.println("CEP : " + address.getCep());
        System.out.println("Street : " + address.getStreet());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
