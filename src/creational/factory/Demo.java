package creational.factory;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Car car;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Какая у меня зарплата?");

        while(scanner.hasNext()) {
            Double salary = scanner.nextDouble();
            car = new CarFactory().getCar(salary);
            car.drive();
        }
    }
}
