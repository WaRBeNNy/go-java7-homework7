package behavioral.mediator;

public class Leader implements Developer{
    Project project;
    String name;

    public Leader(Project project, String name) {
        this.project = project;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void work(String projectName) {
        System.out.print(this.name);
        project.getJobDone(projectName, this);
    }

    @Override
    public void drinkCofee() {
        System.out.println(this.name + " пьет кофе.");
    }
}
