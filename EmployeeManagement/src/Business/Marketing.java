package Business;

import Employee.Supervisor;

public class Marketing extends BusinessUnit{

    public Marketing(String name, Supervisor supervisor) {
        super(name, supervisor);
    }

    @Override
    public void MainActivities() {
        System.out.println("    ---MARKETING---\n");
        System.out.println("-Define Questions and hypothesis");
        System.out.println("-Recollect Data");
        System.out.println("-Align Data with hypothesis");
        System.out.println("-Implement statistical model");
        System.out.println("-Validate model");
        System.out.println("-Deploy model");
        System.out.println();
    }
}
