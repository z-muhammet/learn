package dataBase;

public class employee extends person {

    private String[] id = new String[30];
    private String[] name = new String[30];
    private String[] surname = new String[30];
    private String[] position = new String[30];
    private double[] wage = new double[30];

    public String[] getId() {
        return id;
    }

    public String[] getName() {
        return name;
    }

    public String[] getSurname() {
        return surname;
    }

    public String[] getPosition() {
        return position;
    }

    public double[] getWage() {
        return wage;
    }

    public void setId(int in) {
        this.id[in] = "E_" + this.name[in].substring(0, 1).toLowerCase() + this.surname[in].toLowerCase();
    }

    public void setName(String name, int in) {
        this.name[in] = name;
    }

    public void setSurname(String surname, int in) {
        this.surname[in] = surname;
    }

    public void setPosition(String position, int in) {
        this.position[in] = position;
    }

    public void setWage(double wage, int in) {
        this.wage[in] = wage;
    }

}
