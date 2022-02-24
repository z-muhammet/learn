package logger;

public class customerLogger extends baseLogger {
    public customerLogger() {
        System.out.println("selected customer");
    }

    public String name() {
        return "customer";
    }

}
