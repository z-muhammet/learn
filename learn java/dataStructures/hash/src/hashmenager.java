public class hashmenager {
    node[] hashmap = new node[15];
    int hashmaplinear[] = new int[100];
    int hashmapquadratic[] = new int[100];
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
        int hx = data % 100;
        for (int j = 0; j < 10; j++) {
            int hxx = (hx * j * j) % 100;
            if (hashmapquadratic[hxx] == 0) {
                hashmapquadratic[hxx] = data;
                break;
            }
        }
        linearHash(data, hashmapquadratic);
    }
}

/*
 * public void linearHash(int data) {
 * int key = data % 15;
 * int j = 0;
 * while (hashmaplinear[key + j] != 0) {
 * 
 * çalma kemençem dertli
 * zaten yüreğum yara
 * böyle ayriluk omaz
 * hep mi bu bahtum kara
 * civranin yalısına vardır küçük bir liman
 * gelmeyelum göz göze ağlarum dayanamam
 * gece gökte dağ gibiii
 * hay sikiyum nenenu bu şarkı böyyle mi söylenurr <3
 * 
 * j++;
 * }
 * hashmaplinear[key + j] = data;
 * }
 */