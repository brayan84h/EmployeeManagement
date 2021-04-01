package App;

import Employee.*;

public class App {
    public static void main(String[] args) {

        Supervisor supervisor1 = new Supervisor("100101", "Brayan", "Hernandez", 49, "Brayan@gmail.com");
        Collaborator collaborator1 = new Collaborator("00253", "Ramon", "Ayala", 28, "Ramon_Ayala@hotmail.es");

        Supervisor supervisor2 = new Supervisor("105634", "Jose", "Fernandez", 46, "FerJose67@yahoo.com");

        collaborator1.Addnewlanguage("JAVA");
        collaborator1.Addnewlanguage("Php");
        collaborator1.Addnewlanguage("Kotlin");
        collaborator1.Addnewlanguage("C++");
        collaborator1.PrintLanguages();

        supervisor1.AssignEmpleyees(collaborator1);
        supervisor1.PrintEmpleyees();
        //e1.setAge(1000);

        collaborator1.setMi_supervisor(supervisor1);

        System.out.println(collaborator1.getSalaryInfo());

        supervisor1.setEmployeeSalary(collaborator1, 8900);
        System.out.println("\n"+collaborator1.getSalaryInfo());


        supervisor2.setEmployeeSalary(collaborator1, 8900);
        System.out.println("\n"+collaborator1.getSalaryInfo());
    }
}
