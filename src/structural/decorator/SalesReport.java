package structural.decorator;

public class SalesReport implements Report{
    @Override
    public void print() {
        System.out.println("Отчет по продажам за месяц!");
    }
}
