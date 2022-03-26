/**
 * node
 */
public class node {

    private node leftNode;
    private int data;
    private node rightNode;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(node leftNode) {
        this.leftNode = leftNode;
    }

    public node getRightNode() {
        return rightNode;
    }

    public void setRightNode(node rightNode) {
        this.rightNode = rightNode;
    }

    public node() {
        this.data = 0;
        leftNode = null;
        rightNode = null;
    }

    public node(int data) {
        this.data = data;
        leftNode = null;
        rightNode = null;
    }

}