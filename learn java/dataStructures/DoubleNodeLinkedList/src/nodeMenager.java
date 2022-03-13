public class nodeMenager {
    private node firstNode;
    userOperation userOperation = new userOperation();

    public boolean checkFirst() {
        if (firstNode == null) {
            return true;
        } else {
            return false;
        }
    }

    public node goLast() {
        node temp = firstNode;
        if (checkFirst()) {
            System.out.println("this list null");
        } else {
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
        }
        return temp;
    }

    public void addNodeFirst(node node) {
        if (checkFirst()) {
            firstNode = node;
        } else {
            node.setNext(firstNode);
            firstNode.setBack(node);
            firstNode = node;
        }
    }

    public void addNodeLast(node node) {
        if (checkFirst()) {
            addNodeFirst(node);
        } else {
            node.setBack(goLast());
            goLast().setNext(node);
        }
    }

    public node searcNode() {

        node temp = firstNode;
        if (checkFirst()) {
            System.out.println("this list null");
            return null;
        } else {
            int searhInt = userOperation.getint("pls u enter search int: ");
            while (temp != null) {
                if (temp.get_data() == searhInt) {
                    return temp;
                }
                temp = temp.getNext();
            }
            System.out.println("this list haven't this data ");
            return null;
        }
    }

    public void insertNode(node node) {
        if (checkFirst()) {
            addNodeFirst(node);
        } else {
            node temp = searcNode();
            if (temp.getNext() != null && temp.getBack() != null) {
                node.setNext(temp.getNext());
                node.setBack(temp);
                temp.setNext(node);
            } else if (temp.getBack() != null) {
                addNodeLast(node);
            } else {
                addNodeFirst(node);
            }
        }

    }

    public void addMainNode(node node, node tempNode) {
        if (checkFirst()) {
            addNodeFirst(node);
        } else {
            node temp = tempNode;
            if (temp.getNext() != null && temp.getBack() != null) {
                node.setNext(temp.getNext());
                node.setBack(temp);
                temp.setNext(node);
            } else if (temp.getBack() != null) {
                addNodeLast(node);
            } else {
                addNodeFirst(node);
            }
        }
    }

    public void deleteNode() {

        node temp = searcNode();
        if (temp.getBack() != null) {
            temp.getBack().setNext(temp.getNext());
            temp.getNext().setBack(temp.getBack());
        } else {
            firstNode = null;
        }
    }

    public void list() {
        node temp = firstNode;
        int i = 1;
        while (temp != null) {
            System.out.println(i + ": " + temp.get_data());
            temp = temp.getNext();
            i++;
        }
    }

    public void reverseList() {
        node temp = goLast();
        int i = 1;
        while (temp != null) {
            System.out.println(i + ": " + temp.get_data());
            i++;
            temp = temp.getBack();
        }
    }

    public void sortAddNode(node node) {
        node tempNode = firstNode;
        if (checkFirst() || tempNode.get_data() >= node.get_data()) {
            addNodeFirst(node);
        } else {
            while (tempNode.getNext() != null && tempNode.getNext().get_data() <= node.get_data()) {
                tempNode = tempNode.getNext();
            }
            node.setNext(tempNode.getNext());
            if (node.getNext() != null) {
                node.getNext().setBack(node);
            }
            node.setBack(tempNode);
            tempNode.setNext(node);
        }
    }

}
