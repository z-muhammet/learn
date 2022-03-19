public class node {
    private int data;
    private node next;

    public node() {
        next = null;
        this.data = 0;
    }

    public node(int data) {
        next = null;
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