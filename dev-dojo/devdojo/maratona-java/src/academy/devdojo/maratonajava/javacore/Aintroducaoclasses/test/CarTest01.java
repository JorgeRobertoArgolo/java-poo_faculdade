package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.name = "Bugatti Bolide";
        car1.model = "Bugatti";
        car1.year = 2020;

        Car car2 = new Car();

        car2.name = " Chevrolet Impala";
        car2.model = "Impala";
        car2.year = 1967;

        System.out.println("--------------------------------");
        System.out.println("Car's name : " + car1.name + "\nCar's Model : " + car1.model + "\nRelease Year : " + car1.year);
        System.out.println("Memory address car1 : " + car1);

        System.out.println("--------------------------------");
        System.out.println("Car's name : " + car2.name + "\nCar's Model : " + car2.model + "\nRelease Year : " + car2.year);
        System.out.println("Memory address car2 : " + car2);

        System.out.println("--------------------------------");//Memory address test
        car1 = car2;
        System.out.println("Memory address car1 : " + car1);
        System.out.println("Memory address car2 : " + car2);

        car1.year = 2000;

        System.out.println("--------------------------------");
        System.out.println("Car's name : " + car1.name + "\nCar's Model : " + car1.model + "\nRelease Year : " + car1.year);
        System.out.println("Memory address car1 : " + car1);

        System.out.println("--------------------------------");
        System.out.println("Car's name : " + car2.name + "\nCar's Model : " + car2.model + "\nRelease Year : " + car2.year);
        System.out.println("Memory address car2 : " + car2);


    }
}
