public class stringNode {
    private String Data;
    private stringNode next;

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public stringNode getNext() {
        return next;
    }

    public void setNext(stringNode next) {
        this.next = next;
    }

    public stringNode() {

    }

    public stringNode(String data) {
        setData(data);
        setNext(null);
    }
}
