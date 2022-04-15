public class node {
    private node nextNode;
    private int data;

    public node() {
        data = 0;
        nextNode = null;
    }

    public node(int data) {
        this.data = data;
        this.nextNode = null;
    }

    public node getNextNode() {
        return nextNode;
    }

    public void setNextNode(node nextNode) {
        this.nextNode = nextNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}