import java.io.IOException;
import java.util.Queue;

import dataBase.customer;
import dataBase.employee;
import dataBase.person;
import logger.baseLogger;
import logger.customerLogger;
import logger.employeeLogger;
import menager.customerMenager;
import menager.finder;

public class App {
    public static void main(String[] args) throws IOException {
        person person[] = new person[] { new employee(), new customer() };
        baseLogger logger[] = new baseLogger[] { new customerLogger(), new employeeLogger() };
        finder finder = new finder();
        customerMenager menager = new customerMenager();
        person[0].setName("name", 0);
        System.out.println(finder.amountOfData(person[0], logger[0]));

    }
}
