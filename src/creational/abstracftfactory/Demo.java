package creational.abstracftfactory;

import java.util.Scanner;

import static java.lang.System.exit;

public class Demo {
    public static void main(String[] args) {
        Car car;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую машину посмотрим?");
        System.out.println("1. Ниссан");
        System.out.println("2. Ланос");
        System.out.println("3. Выход");

        while(scanner.hasNext()){
            String choice = scanner.next();
            switch(choice) {
                case "1":
                    car = new Car(new NissanFactory());
                    car.demo();
                    break;
                case "2":
                    car = new Car(new LanosFactory());
                    car.demo();
                    break;
                case "3":
                    exit(1);
                    break;
                default:
                    System.out.println("Wrong input!");
            }
        }
    }
}
