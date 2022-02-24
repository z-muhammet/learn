package logger;

public class employeeLogger extends baseLogger {
    public employeeLogger() {
        System.out.println("selected employee");
    }

    public String name() {
        return "employee";
    }
}
