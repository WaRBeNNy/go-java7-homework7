package creational.builder;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new NissanBuilder();

        director.setBuilder(builder);
        director.constructCar();

        System.out.println(director.getCar());
    }
}
