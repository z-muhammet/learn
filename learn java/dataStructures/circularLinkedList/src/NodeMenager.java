public class NodeMenager {
    private Node firstNode;
    private Node lastNode;

    public void setFirstNode(Node node) {
        firstNode = node;
        lastNode = node;
        lastNode.setNextNode(firstNode);
    }

    public boolean checkList() {
        if (firstNode == null) {
            return true;
        } else {
            return false;
        }
    }

    public void firsAddNode(Node node) {
        if (checkList()) {
            setFirstNode(node);
        } else {
            node.setNextNode(firstNode);
            firstNode = node;
            lastNode.setNextNode(node);
        }
    }

    public void lastAddNode(Node node) {
        lastNode.setNextNode(node);
        lastNode = node;
        node.setNextNode(firstNode);
    }

    public void addNode(Node node) {
        if (checkList()) {
            firsAddNode(node);
        } else {
            lastAddNode(node);
        }
    }

    public void insertNode(Node node, int data) {
        Node tempNode = searchNode(data);
        if (tempNode != null) {
            if (tempNode == lastNode || tempNode == firstNode) {
                addNode(node);
                return;
            }

        }
    }

    public void deleteNode(int data) {
        Node tempNode = searchNode(data);
        if (tempNode != null) {
            if (tempNode.getNextNode() != lastNode) {
                tempNode.setNextNode(tempNode.getNextNode().getNextNode());
            } else if (tempNode.getNextNode() == firstNode) {
                firstNode = tempNode.getNextNode().getNextNode();
                tempNode.setNextNode(tempNode.getNextNode().getNextNode());
            } else {
                lastNode = tempNode;
                tempNode.setNextNode(firstNode);
            }
        }
    }

    public Node searchNode(int data) {
        if (checkList()) {
            System.out.println("this list empty");
            return null;
        } else {
            Node tempNode = firstNode;
            do {
                if (tempNode.getNextNode().getData() == data) {
                    return tempNode;
                }
                tempNode = tempNode.getNextNode();
            } while (tempNode != firstNode);
        }
        System.out.println("list haven't this element");
        return null;
    }

    public void list() {
        if (checkList()) {
            System.out.println("this list empty");
        } else {
            Node tempNode = firstNode;
            int i = 1;
            do {
                System.out.println(i + ": " + tempNode.getData());
                i++;
                tempNode = tempNode.getNextNode();
            } while (tempNode != firstNode);
        }
    }

    public void sortAddNode(Node node) {
        Node tempNode = firstNode;
        if (checkList() || node.getData() <= tempNode.getData()) {
            firsAddNode(node);
        } else {
            while (tempNode.getNextNode().getData() <= node.getData() && tempNode.getNextNode() != firstNode) {
                tempNode = tempNode.getNextNode();
            }
            if (tempNode.getNextNode() != firstNode) {
                node.setNextNode(tempNode.getNextNode());
                tempNode.setNextNode(node);
            } else {
                node.setNextNode(tempNode.getNextNode());
                tempNode.setNextNode(node);
                lastNode = node;
            }
        }
    }
}