public class node {
    private int data;
    private node next;

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

    public node() {
        this.data = 0;
        this.next = null;
    }

    public node(int data) {
        this.data = data;
        this.next = null;

    }
}
