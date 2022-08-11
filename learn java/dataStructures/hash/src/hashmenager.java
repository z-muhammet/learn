public class hashmenager {
    node[] hashmap = new node[15];
    int hashmaplinear[] = new int[100];
    int hashmapquadratic[] = new int[11];
    int conflictlinear;
    int conflictquadronic;

    public void chaining(int data) {
        int key = data % 15;
        if (hashmap[key] == null) {
            hashmap[key] = new node(data);
        } else {
            node tempNode = hashmap[key];
            while (tempNode.getNextNode() != null) {
                tempNode = tempNode.getNextNode();
            }
            tempNode.setNextNode(new node(data));
        }
    }

    public void linearHash(int data, int hashmap[]) {
        int key = data % 15;
        int j = 0;
        while (hashmap[key + j] != 0 && j + key < 99) {
            j++;
        }
        hashmap[key + j] = data;
    }

    public void quadratic(int data) {
        int newtry = 0;
        int hx = (data * data) % 11;
        if (hashmapquadratic[hx] == 0) {
            hashmapquadratic[hx] = data;
        } else {
            while (hashmapquadratic[hx + (newtry * newtry)] != 0) {
                newtry++;
            }
            hashmapquadratic[hx + (newtry * newtry)] = data;
        }

    }
}
