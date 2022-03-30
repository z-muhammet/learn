import java.util.Queue;
import java.util.Stack;

public class nodemenager {
    private node rootNode;

    Stack<node> stack = new Stack<node>();
    Stack<node> stack2 = new Stack<node>();

    public node getRootNode() {
        return rootNode;
    }

    public void setRootNode(node rootNode) {
        this.rootNode = rootNode;
    }

    public boolean checklist() {
        if (rootNode == null) {
            return true;
        } else {
            return false;
        }
    }

    public void addNode(node node) {
        if (checklist()) {
            rootNode = node;
        } else {
            node tempNode = rootNode;
            while ((node.getData() >= tempNode.getData() && tempNode.getRightNode() != null)
                    || (node.getData() < tempNode.getData() && tempNode.getLeftNode() != null)) {
                if (node.getData() < tempNode.getData()) {
                    tempNode = tempNode.getLeftNode();
                } else {
                    tempNode = tempNode.getRightNode();
                }
            }
            if (node.getData() < tempNode.getData()) {
                tempNode.setLeftNode(node);
            } else {
                tempNode.setRightNode(node);
            }
        }
    }

    public node search(int data) {
        node tempNode = rootNode;
        while ((data > tempNode.getData() && tempNode.getRightNode() != null)
                || (data < tempNode.getData() && tempNode.getLeftNode() != null)) {
            if (data < tempNode.getData()) {
                tempNode = tempNode.getLeftNode();
            } else if (data > tempNode.getData()) {
                tempNode = tempNode.getRightNode();
            }
        }

        if (tempNode.getData() == data) {
            return tempNode;
        } else {
            return null;
        }
    }

    public node searchv2(int data) {
        node tempNode = rootNode;
        while ((data > tempNode.getData() && tempNode.getRightNode() != null)
                || (data < tempNode.getData() && tempNode.getLeftNode() != null)) {
            if (data < tempNode.getData()) {
                stack2.push(tempNode);
                tempNode = tempNode.getLeftNode();
            } else if (data > tempNode.getData()) {
                stack2.push(tempNode);
                tempNode = tempNode.getRightNode();
            }
        }

        if (tempNode.getData() == data) {
            tempNode = stack2.pop();
            stack2.removeAllElements();
            return tempNode;
        } else {
            return null;
        }
    }

    public node minParentNode() {
        node tempNode = rootNode;
        int data = rootNode.getData();
        while ((tempNode.getData() <= data) && tempNode.getLeftNode() != null) {
            data = tempNode.getData();
            stack.push(tempNode);
            tempNode = tempNode.getLeftNode();
        }
        tempNode = stack.pop();
        stack.clear();
        return tempNode;
    }

    public node min(node tempNode) {
        int data = tempNode.getData();
        while ((tempNode.getData() <= data) && tempNode.getLeftNode() != null) {
            data = tempNode.getData();
            tempNode = tempNode.getLeftNode();
        }
        return tempNode;
    }

    public node maxParentNode() {
        node tempNode = rootNode;
        int data = tempNode.getData();
        while ((tempNode.getData() >= data) && tempNode.getRightNode() != null) {
            data = tempNode.getData();
            stack.push(tempNode);
            tempNode = tempNode.getRightNode();
        }
        tempNode = stack.pop();
        return tempNode;

    }

    public node max(node tempNode) {
        int data = tempNode.getData();
        while ((tempNode.getData() >= data) && tempNode.getRightNode() != null) {
            data = tempNode.getData();
            tempNode = tempNode.getRightNode();
        }
        return tempNode;
    }

    public void rightList() {
        node tempNode = rootNode.getRightNode();

        while (tempNode.getRightNode() != null) {
            if (tempNode.getRightNode() != null || tempNode.getLeftNode() != null) {
                stack.push(tempNode);
            }
            tempNode = tempNode.getRightNode();
        }
    }

    public void leftList() {
        node tempNode = rootNode.getLeftNode();
        while (tempNode.getLeftNode() != null) {
            if (tempNode.getRightNode() != null || tempNode.getLeftNode() != null) {
                stack.push(tempNode);
            }
            tempNode = tempNode.getLeftNode();
        }
    }

    public void list() {
        node temp = stack.pop();
        if (stack.empty()) {
            System.out.println("empty");
        } else {
            for (int i = 0; i < stack.size(); i++) {

                if (temp.getRightNode() != null) {
                    System.out.println(temp.getRightNode().getData());
                } else if (temp.getLeftNode() != null) {
                    System.out.println(temp.getLeftNode().getData());

                }
            }
        }
    }

    public void preorder(node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getData());
        preorder(node.getLeftNode());
        preorder(node.getRightNode());
    }

    public void postorder(node node) {
        if (node == null) {
            return;
        }
        preorder(node.getLeftNode());
        preorder(node.getRightNode());
        System.out.println(node.getData());
    }

    public void inorder(node node) {
        if (node == null) {
            return;
        }
        preorder(node.getLeftNode());
        System.out.println(node.getData());
        preorder(node.getRightNode());
    }

    public void deleteTwoChild(node tempNode, boolean check) {
        if (check) {
            if (tempNode.getRightNode() != null && tempNode.getLeftNode() != null) {
                if (tempNode != rootNode) {

                } else {
                    int tempdata = min(tempNode.getRightNode()).getData();
                    deleteTwoChild(searchv2(tempdata), false);
                    tempNode.setData(tempdata);
                }
            }
        } else {
            if (tempNode.getRightNode().getRightNode() == null) {
                tempNode.setRightNode(null);
            } else {
                tempNode.setRightNode(tempNode.getRightNode().getRightNode());
            }
        }
    }

    public void deleteMain(int data) {
        node tempnode1 = search(data);
        if (tempnode1 == null) {
            System.out.println("this element haven't in list");
            return;
        }
        node tempNode2 = searchv2(data);
        if (tempnode1.getLeftNode() != null && tempnode1.getRightNode() != null) {
            deleteTwoChild(tempnode1, true);
        } else if (tempNode2.getLeftNode() == tempnode1) {
            deleteHelper(data, true);
        } else {
            deleteHelper(data, false);
        }

    }

    public void deleteHelper(int data, boolean check) {
        node tempNode = searchv2(data);
        if (check) {
            if (tempNode.getLeftNode().getRightNode() == null && tempNode.getLeftNode().getLeftNode() == null) {
                tempNode.setLeftNode(null);
            } else {
                if (tempNode.getLeftNode().getRightNode() != null) {
                    tempNode.setLeftNode(tempNode.getLeftNode().getRightNode());
                } else {
                    tempNode.setLeftNode(tempNode.getLeftNode().getLeftNode());
                }
            }
        } else {
            if (tempNode.getRightNode().getRightNode() == null && tempNode.getRightNode().getLeftNode() == null) {
                tempNode.setRightNode(null);
            } else {
                if (tempNode.getRightNode().getRightNode() != null) {
                    tempNode.setRightNode(tempNode.getRightNode().getRightNode());
                } else {
                    tempNode.setRightNode(tempNode.getRightNode().getLeftNode());
                }
            }
        }
    }
}
