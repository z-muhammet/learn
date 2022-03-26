public class nodemenager {
    private node firstNode;
    private node lastNode;
    private int timer = 0;

    public void timerupdate(boolean control) {
        if (control) {
            timer++;
            return;
        }
        timer--;
    }

    public boolean checkList() {
        if (firstNode == null) {
            return true;
        } else {
            return false;
        }
    }

    public void addStack(node node) {
        if (checkList()) {
            firstNode = node;
            lastNode = node;
        } else {
            lastNode.setNext(node);
            lastNode = node;
        }
    }

    public node peek() {
        node tempNode = lastNode;
        if (tempNode == firstNode) {
            firstNode = null;
        } else {
            lastNode = goLast();
            lastNode.setNext(null);
        }
        return tempNode;
    }

    public node goLast() {
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

    public void control() {
        node tempNode = firstNode;
        while (tempNode.getNext() != null) {
            if (tempNode.getData().equals("(") && lastNode.getData().equals(")")
                    || (tempNode.getData().equals(")") && lastNode.getData().equals("("))) {
                firstNode = tempNode.getNext();
                peek();
            }
            tempNode = tempNode.getNext();
        }
    }
}
