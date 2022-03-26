public class App {
    public static void main(String[] args) throws Exception {
        nodemenager nodemenager = new nodemenager();

        nodemenager.addNode(new node(4));
        nodemenager.addNode(new node(2));
        nodemenager.addNode(new node(3));
        nodemenager.addNode(new node(1));
        nodemenager.addNode(new node(8));
        nodemenager.addNode(new node(6));
        nodemenager.addNode(new node(7));
        nodemenager.addNode(new node(9));
        nodemenager.addNode(new node(97));
        nodemenager.preorder(nodemenager.getRootNode());
        nodemenager.deleteMain(6);
        nodemenager.preorder(nodemenager.getRootNode());
        nodemenager.deleteMain(7);
        nodemenager.preorder(nodemenager.getRootNode());
        nodemenager.deleteMain(8);
        nodemenager.preorder(nodemenager.getRootNode());
        nodemenager.deleteMain(9);
        nodemenager.preorder(nodemenager.getRootNode());
    }
}
