package Employee;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {

    private String id;
    private String name;
    private String lastname;
    private int age;
    private String email;

    private Supervisor mi_supervisor;

    protected float salary;

    public Employee(String id, String name, String lastname, int age, String email) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.setAge(age);
        this.setEmail(email);
        this.salary = 0 ;
    }

    public Supervisor getMi_supervisor() {
        return this.mi_supervisor;
    }

    public void setMi_supervisor(Supervisor mi_supervisor) {
        this.mi_supervisor = mi_supervisor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age<=1||age>99){
            age=1;
            System.out.println("El valor enviando no se encuentra dentro del rango especificados(1, 99), POR LO TANTO EL VALOR FUE SET CON 1");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        if (!validation_email(email)){
            System.out.println("NO INGRESO SU CORREO CORRECTAMENTE, TRATE DE INGRESAR DE LA FORMA(email@gmail.com)");
        }

    }

    //Metodo de validacion de correo
    public boolean validation_email(String email){
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(email);
        return matcher.find();// .find() nos regresa un valor Boolean
    }

    public String Presentation(){
        return "\t- "+this.id+" - "+this.name+" - "+this.lastname;
    }
}
