package structural.decorator;

public class Demo {
    public static void main(String[] args) {
        Report report = new PersonalReport(new ItemsReport(new SalesReport()));

        report.print();
    }
}
