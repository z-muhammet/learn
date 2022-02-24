package dataBase;

public class person {
    private person data;

    public person() {

    }

    public person(person data) {
        this.data = data;
    }

    public String[] getId() {
        return data.getId();
    }

    public String[] getName() {
        return data.getName();
    }

    public String[] getSurname() {
        return data.getSurname();
    }

    public String[] getPosition() {
        return data.getPosition();
    }

    public String[] getrank() {
        return data.getPosition();
    }

    public double[] getWage() {
        return data.getWage();
    }

    public double[] getdebt() {
        return data.getdebt();
    }

    public void setId(int in) {
        data.setId(in);
    }

    public void setName(String name, int in) {
        data.setName(name, in);
    }

    public void setSurname(String surname, int in) {
        data.setSurname(surname, in);
    }

    public void setPosition(String position, int in) {
        data.setSurname(position, in);
    }

    public void setRank(String rank, int in) {
        data.setRank(rank, in);
    }

    public void setWage(double wage, int in) {
        data.setWage(wage, in);
    }

    public void setdebt(double debt, int in) {
        data.setdebt(debt, in);
    }
}
