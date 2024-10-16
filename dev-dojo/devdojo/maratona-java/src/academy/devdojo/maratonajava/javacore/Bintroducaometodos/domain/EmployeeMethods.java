package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class EmployeeMethods {
    public static float averageWage (float[] salary) {
        float average;
        float sum = 0;
        for(int i = 0; i < salary.length; i++){
            sum += salary[i];
        }
        average = sum / salary.length;
        return average;
    }

    public static void printInformationAboutEmployee (Employee employee) {
        System.out.println("-------------------------------------");
        System.out.println("    Information About Employee");
        System.out.println("-------------------------------------");
        System.out.println("Name : " + employee.name);
        System.out.println("Age : " + employee.age);
        System.out.println("Average Wage : " + employee.average);
    }
}