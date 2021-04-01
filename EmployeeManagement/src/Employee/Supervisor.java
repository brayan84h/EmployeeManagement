package Employee;

import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Employee {
    
    private List<Employee> employees;
    
    public Supervisor(String id, String name, String lastname, int age, String mail) {
        super(id, name, lastname, age, mail);
        this.employees = new ArrayList<Employee>();
    }

    public void AssignEmpleyees(Employee employee){
        this.employees.add(employee);
    }

    
    public void PrintEmpleyees(){

        System.out.println("\n---This supervisor("+super.getName()+") has as employees: ---");

        for (Employee s: this.employees) {
            System.out.println(s.Presentation());
        }
    }

    public void setEmployeeSalary(Employee employee, float salary){

        if (this.getId()==employee.getMi_supervisor().getId()) {
            employee.salary = salary;
        }else{
            System.out.println("WARNING: eL SUPERVISO NO TIENE EL ACESSO PARA CAMBIAR EL SALARIO");
        }

    }
}
