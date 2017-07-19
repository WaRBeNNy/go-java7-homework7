package structural.decorator;

public class ReportDecorator implements Report{
    Report report;

    public ReportDecorator(Report report) {
        this.report = report;
    }

    public void print() {
        report.print();
    }
}
