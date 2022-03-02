package logger;

public class baseLogger {
    private baseLogger base;

    public baseLogger(baseLogger base) {
        this.base = base;
    }

    public baseLogger() {

    }

    public String add() {
        return "new " + name() + " added";
    }

    public String delete(String id) {
        return "id:" + id + " deleted";
    }

    public String edit(String id) {
        return "id:" + id + " edited";
    }

    public String finderNotFound() {
        return "this " + name() + " Not Found";
    }

    public String finderNoData() {
        return "u haven't a " + name() + " data";
    }

    public String name() {
        return base.name();
    }

}
