public class intNode {
    private int Data;
    private intNode next;

    public intNode getNext() {
        return next;
    }

    public void setNext(intNode next) {
        this.next = next;
    }

    public int getData() {
        return Data;
    }

    public void setData(int intData) {
        this.Data = intData;
    }

    public intNode() {
        setData(0);
        setNext(null);
    }

    public intNode(int Data) {
        setData(Data);
        setNext(null);
    }

}