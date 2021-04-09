package Utils;

public class SalaryCalculationInfo {
    private static final double PRICE_DAY_COLLABORATOR = 350.50;
    private static final double PRICE_DAY_SUPERVISOR = 405.60;


    public static void information_of_price_day(){
        System.out.println("El precio por dia de trabajo de un Colaborador es; " +PRICE_DAY_COLLABORATOR);
        System.out.println("El precio por dia de trabajo de un Colaborador es; " +PRICE_DAY_SUPERVISOR);

        System.out.println("Los sueldos netos se calculan de la siguinte manera: " +
                "\n\t-Precio del dia de trabajo X los dias trabajados del empleado\n");
    }

    public static void calculate_Salary_of_COLLABORATOR(int days_of_work){
        double salary = 0;
        salary = PRICE_DAY_COLLABORATOR * days_of_work;
        System.out.println("El sueldo neto del COLABORADOR de acuerdo a sus horas trabajadas es: "+ salary);
    }

    public static void calculate_Salary_of_SUPERVISOR(int days_of_work){
        double salary = 0;
        salary = PRICE_DAY_SUPERVISOR * days_of_work;
        System.out.println("El sueldo neto del SUPERVISOR de acuerdo a sus horas trabajadas es: "+ salary);
    }
}
