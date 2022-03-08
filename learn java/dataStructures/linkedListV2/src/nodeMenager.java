public class nodeMenager {
    private stringNode firstStringNode;
    private intNode firstintNode;

    public stringNode getFirstStringNode() {
        return firstStringNode;
    }

    public void setFirstStringNode(stringNode firstStringNode) {
        this.firstStringNode = firstStringNode;
    }

    public intNode getFirstintNode() {
        return firstintNode;
    }

    public void setFirstintNode(intNode firstintNode) {
        this.firstintNode = firstintNode;
    }

    public void addFirst(stringNode node) {
        setFirstStringNode(node);
    }

    public void addFirst(intNode node) {
        setFirstintNode(node);
    }

    public boolean checkFirstInt() {
        if (firstintNode != null) {
            return false;
        }
        return true;
    }

    public boolean checkFirstString() {
        stringNode node = firstStringNode;
        if (node != null) {
            return false;
        }
        return true;
    }

    public intNode goLastintNode() {
        intNode temp = firstintNode;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        return temp;
    }

    public stringNode goLastStringNode() {
        stringNode temp = firstStringNode;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        return temp;
    }

    public stringNode searchBackStringNode(String search) {
        stringNode temp = firstStringNode;
        if (checkFirstString()) {
            return null;
        } else if (temp.getData().equals(search)) {
            return temp;
        }
        while (temp.getNext() != null) {
            if (temp.getNext().getData().equals(search)) {
                temp = temp.getNext();
            }
        }
        return temp;
    }

    public intNode searcbackIntNode(int data) {
        intNode temp = firstintNode;
        if (checkFirstInt()) {
            return null;
        } else if (temp.getData() == data) {
            return temp;
        }
        while (temp.getNext() != null) {
            if (temp.getNext().getData() == data) {
                break;
            }
            temp = temp.getNext();
        }
        return temp;
    }

    public void addFirstString(stringNode node) {
        if (checkFirstString()) {
            firstStringNode = node;
        } else {
            node.setNext(firstStringNode);
            firstStringNode = node;
        }
    }

    public void addFirstInt(intNode node) {
        if (checkFirstInt()) {
            firstintNode = node;
        } else {
            node.setNext(firstintNode);
            firstintNode = node;
        }
    }

    public void addlastString(stringNode node) {
        goLastStringNode().setNext(node);
    }

    public void addLastInt(intNode node) {
        goLastintNode().setNext(node);
    }

    public void insert(intNode temp, intNode newNode) {
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
    }

    public void addSortNewInt(intNode node) {
        if (checkFirstInt() || firstintNode.getData() >= node.getData()) {
            addFirstInt(node);
        } else {
            intNode temp = firstintNode;
            while (temp.getNext() != null && temp.getNext().getData() < node.getData()) {
                temp = temp.getNext();
            }
            insert(temp, node);
        }
    }

    public void deleteInt(int data) {
        if (searcbackIntNode(data) != null) {
            searcbackIntNode(data).setNext(searcbackIntNode(data).getNext().getNext());
        } else {
            System.out.println("this list haven't a element");
        }
    }

    public void listInt() {
        intNode temps = firstintNode;
        int i = 1;
        if (temps != null) {
            while (temps != null) {
                System.out.println(i + ": " + temps.getData());
                temps = temps.getNext();
                i++;
            }
        } else {
            System.out.println("this list haven't a element");
        }
    }
}