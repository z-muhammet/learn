import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        int sel = 0, data;
        Scanner scanner = new Scanner(System.in);
        NodeMenager nodeMenager = new NodeMenager();
        while (sel != 5) {
            System.out.println(
                    "pls u select (1 add new element, 2 delete a element, 3 list all element, 4 search a element, 5 exit)");
            sel = scanner.nextInt();
            switch (sel) {

                case 1:
                    System.out.print("pls u enter value: ");
                    data = scanner.nextInt();
                    nodeMenager.sortAddNode(new Node(data));
                    break;
                case 2:
                    nodeMenager.list();
                    System.out.print("pls u enter deleted value: ");
                    data = scanner.nextInt();
                    nodeMenager.deleteNode(data);
                    break;
                case 3:
                    nodeMenager.list();
                    break;
                case 4:
                    nodeMenager.list();
                    System.out.print("pls u enter search value: ");
                    data = scanner.nextInt();
                    if (nodeMenager.searchNode(data).getNextNode() != null)
                        System.out.println("list have this: " + nodeMenager.searchNode(data).getData());
                    break;
                default:
                    System.out.println("pls u try again...");
                    break;
            }

        }
    }
}
