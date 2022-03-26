/**
 * node
 */
public class node {

    private node next;
    private node back;

    public node getBack() {
        return back;
    }

    public void setBack(node back) {
        this.back = back;
    }

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }

    public node() {
        this.data = null;
        this.next = null;
        this.back = null;
    }

    public node(String data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }

}