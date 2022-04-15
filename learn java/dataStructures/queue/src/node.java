public class node {
    private int data;
    private String dat;
    private node next;

    public String getDat() {
        return dat;
    }

    public void setDat(String dat) {
        this.dat = dat;
    }

    public node() {
        next = null;
        this.data = 0;
    }

    public node(int data, String dat) {
        next = null;
        this.dat = dat;
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }
}