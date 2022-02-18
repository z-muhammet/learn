package dataBase;

public class person {
    private person data;

    public person() {

    }

    public person(person data) {
        System.out.println("x");
        this.data = data;
    }

    public String getName() {
        System.out.println("x");
        return data.getName();
    }

    public void setName(String name) {
        data.setName(name);
    }

}
