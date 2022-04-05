package automation;

import java.util.ArrayList;

public class ArrayList_Q5 {
    public static void main(String[] args) {
        ArrayList<String> name= new ArrayList<>();
        name.add("Scrum");
        name.add("Java");
        name.add("Jira");
        name.add("selenium");
        name.add("Cucumber");
        name.add("Postman");
        for (String nam : name) {
            System.out.println(nam);

        }
    }
}
