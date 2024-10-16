package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car.setLimitSpeed(200);

        Car c1 = new Car("BMW", 280);
        Car c2 = new Car("Mercedes", 275);
        Car c3 = new Car("Audi", 290);

        //c1.setLimitSpeed(150);//change all, no only the c1. Because this var is static
        //Car.limitSpeed = 180;

        c1.printer();
        c2.printer();
        c3.printer();
    }
}
