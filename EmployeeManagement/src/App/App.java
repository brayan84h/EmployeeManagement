package App;

import Employee.*;

public class App {
    public static void main(String[] args) {

        Supervisor supervisor1 = new Supervisor("100101", "Brayan", "Hernandez", 49, "Brayangmail.com");
        Collaborator collaborator1 = new Collaborator("00253", "Ramon", "Ayala", 28, "Ramon_Ayala@hotmail.es");

        collaborator1.Addnewlanguage("JAVA");
        collaborator1.Addnewlanguage("Php");
        collaborator1.Addnewlanguage("Kotlin");
        collaborator1.Addnewlanguage("C++");
        collaborator1.PrintLanguages();

        supervisor1.AssignEmpleyees(collaborator1);
        supervisor1.PrintEmpleyees();
        //e1.setAge(1000);
    }
}
