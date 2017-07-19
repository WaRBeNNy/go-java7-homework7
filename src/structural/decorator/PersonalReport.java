package structural.decorator;

public class PersonalReport extends ReportDecorator {
    public PersonalReport(Report report) {
        super(report);
    }

    public void print(){
        report.print();
        System.out.println("А также в разрезе менеджеров!");
    }
}
