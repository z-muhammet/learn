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

    public void enquee(node node) {
        if (checkList()) {
            addFirst(node);
            setSay(true);
        } else {
            node tempNode = firstNode;
            while (tempNode.getNext() != firstNode && node.getData() > tempNode.getData()) {
                tempNode = tempNode.getNext();
            }
            if (tempNode.getNext() == firstNode && tempNode.getData() < node.getData()) {
                addLast(node);
                setSay(true);
            } else if (tempNode == firstNode) {
                setSay(true);
                node.setNext(tempNode);
                firstNode = node;
                lastNode.setNext(node);
            } else {
                node tempNode2 = firstNode;
                while (tempNode2.getNext() != tempNode) {
                    tempNode2 = tempNode2.getNext();
                }
                node.setNext(tempNode);
                tempNode2.setNext(node);
                setSay(true);
            }
        }
    }

    public void getFirstNode() {
        node tempNode = firstNode;
        firstNode = firstNode.getNext();
        lastNode.setNext(firstNode);
        System.out.println(tempNode.getDat());
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
            firstNode.setNext(lastNode);
            lastNode = node;
            lastNode.setNext(firstNode);
        }
    }

    public void addLast(node node) {
        node tempNode = lastNode;
        tempNode.setNext(node);
        lastNode = node;
        node.setNext(firstNode);
    }

}
