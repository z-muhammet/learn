public class nodemenager {
    private node firstNode;
    private node lastNode;

    public boolean checkList() {
        if (firstNode == null) {
            return true;
        } else {
            return false;
        }
    }

    public node getLastNode() {
        return lastNode;
    }

    public node getStackNode() {
        node tempNode = lastNode;
        if (tempNode == firstNode) {
            firstNode = null;
        } else {
            lastNode = goLastNode();
            lastNode.setNext(null);
        }
        return tempNode;
    }

    public void addFirstNode(node node) {
        firstNode = node;
        lastNode = node;
    }

    public void addLastNode(node node) {
        lastNode.setNext(node);
        lastNode = node;
    }

    public node goLastNode() {
        if (checkList()) {
            return null;
        } else {
            node tempNode = firstNode;
            while (tempNode.getNext() != lastNode) {
                tempNode = tempNode.getNext();
            }
            return tempNode;
        }
    }

    public int size() {
        int size = 1;
        node tempNode = firstNode;
        while (tempNode.getNext() != null) {
            size++;
            tempNode = tempNode.getNext();
        }
        return size;
    }
}
