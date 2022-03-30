import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        nodemenager nodemenager = new nodemenager();
        Scanner scan = new Scanner(System.in);
        int select = 0, data = 0;
        while (select != 8) {
            System.out.println(
                    "pls u enter select (add new element (1) post order (2) pre order (3) in order (4) search (5) min data (6) max data (7) exit (8))");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    System.out.println("pls u enter new element data: ");
                    nodemenager.addNode(new node(scan.nextInt()));
                    break;
                case 2:
                    nodemenager.postorder(nodemenager.getRootNode());
                    break;
                case 3:
                    nodemenager.preorder(nodemenager.getRootNode());
                    break;
                case 4:
                    nodemenager.inorder(nodemenager.getRootNode());
                    break;
                case 5:
                    System.out.println("pls u enter search data: ");
                    if (nodemenager.search(scan.nextInt()) != null) {
                        System.out.println("tree have this element");
                    } else {
                        System.out.println("tree haven't this element");
                    }
                    break;
                case 6:
                    System.out.println("this tree min data: " + nodemenager.min(nodemenager.getRootNode()).getData());
                    break;
                case 7:
                    System.out.println("this tree max data: " + nodemenager.max(nodemenager.getRootNode()).getData());
                    break;
                case 8:
                    break;
                default:
                    System.out.println("pls try again...");
                    break;
            }
        }
    }
}
