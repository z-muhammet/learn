public class queue extends nodeMenager {

    public void addQueue(node node) {
        if (checkList()) {
            addFirst(node);
            setSay(true);
        } else {
            addLast(node);
            setSay(true);
        }
    }

    public void getQueue() {
        if (checkList()) {
            System.out.println("this list havn't a elements");
        } else {
            getFirstNode();
        }
    }

}
