public class nodeMenager {
    private node firstNode;
    private node lastNode;
    private int say = 0;

    public int getSay() {
        return say;
    }

    public void setSay(boolean increase) {
        if (increase) {
            say++;
        } else {
            say--;
        }
    }

    public void getFirstNode() {
        node tempNode = firstNode;
        firstNode = firstNode.getNext();
        lastNode.setNext(firstNode);
        System.out.println(tempNode.getData());
        setSay(false);
        if (firstNode == lastNode && say == 0) {
            firstNode = null;
            lastNode = null;
        }
    }

    public void priority(node node) { 
        node.setNext(firstNode);
        firstNode = node;
        if (lastNode == null) {
            lastNode = node;
        } else {
            lastNode.setNext(node);
        }

        setSay(true);
    }

    public boolean checkList() {
        if (firstNode == null) {
            return true;
        } else {
            return false;
        }
    }

    public void addFirst(node node) {
        if (checkList()) {
            firstNode = node;
            lastNode = node;
        }
    }

    public void addLast(node node) {
        node tempNode = lastNode;
        tempNode.setNext(node);
        lastNode = node;
        node.setNext(firstNode);
    }

}
