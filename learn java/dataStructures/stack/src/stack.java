public class stack extends nodemenager {

    public void addStackElement(node node) {
        if (checkList()) {
            addFirstNode(node);
        } else {
            addLastNode(node);
        }
    }

    public node peek() {
        if (checkList()) {
            return null;
        } else {
            return getLastNode();
        }
    }

    public node pop() {
        if (checkList()) {
            return null;
        } else {
            return getStackNode();
        }
    }

    public int sizeOfList() {
        if (checkList()) {
            return 0;
        } else {
            return size();
        }
    }
}
