package structural.decorator;

public class ItemsReport extends ReportDecorator{
    public ItemsReport(Report report) {
        super(report);
    }

    public void print() {
        report.print();
        System.out.println("А также в разрезе продукции!");
    }
}
