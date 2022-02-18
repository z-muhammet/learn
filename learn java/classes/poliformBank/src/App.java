import java.io.IOException;

import dataBase.customer;
import dataBase.employee;
import dataBase.person;

public class App {
    public static void main(String[] args) throws IOException {
        person person[] = new person[] { new employee(), new customer() };
        person[0].setName("hebele");
        System.out.println(person[0].getName());
    }
}
