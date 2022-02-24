package dataBase;

public class customer extends person {
    private String[] id = new String[30];
    private String[] name = new String[30];
    private String[] surname = new String[30];
    private String[] rank = new String[30];
    private double[] debt = new double[30];

    public String[] getId() {
        return id;
    }

    public String[] getName() {
        return name;
    }

    public String[] getSurname() {
        return surname;
    }

    public String[] getrank() {
        return rank;
    }

    public double[] getdebt() {
        return debt;
    }

    public void setId(int in) {
        this.id[in] = "C_" + this.name[in].substring(0, 1).toLowerCase() + this.surname[in].toLowerCase();
    }

    public void setName(String name, int in) {
        this.name[in] = name;
    }

    public void setSurname(String surname, int in) {
        this.surname[in] = surname;
    }

    public void setRank(String rank, int in) {
        this.rank[in] = rank;
    }

    public void debt(double debt, int in) {
        this.debt[in] = debt;
    }
}
