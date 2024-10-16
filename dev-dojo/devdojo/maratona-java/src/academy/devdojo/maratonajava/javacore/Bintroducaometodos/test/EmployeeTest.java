package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Employee;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.EmployeeMethods;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Jorge Roberto";
        employee.age = 20;
        employee.wage[0] = 800;
        employee.wage[1] = 1000;
        employee.wage[2] = 1100;

        employee.average = EmployeeMethods.averageWage(employee.wage);
        EmployeeMethods.printInformationAboutEmployee(employee);
    }
}