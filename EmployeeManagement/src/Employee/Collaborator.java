package Employee;

import java.util.ArrayList;
import java.util.List;

public class Collaborator extends Employee {

    private List<String> programing_languages;
    public Collaborator(String id, String name, String lastname, int age, String mail) {
        super(id, name, lastname, age, mail);
        programing_languages= new ArrayList<String>();
    }

    public void Addnewlanguage(String language){
        this.programing_languages.add(language);
    }

    public void PrintLanguages(){

        System.out.println(super.getId()+" knows the follow languages: ---");

        for (String languages:this.programing_languages) {
            System.out.println("  -"+languages);
        }
    }
}
