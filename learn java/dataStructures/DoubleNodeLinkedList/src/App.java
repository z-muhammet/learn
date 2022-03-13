import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        int sel = 0, data;
        Scanner scanner = new Scanner(System.in);
        nodeMenager nodeMenager = new nodeMenager();
        while (sel != 5) {
            System.out.println(
                    "pls u select (1 add new element, 2 delete a element, 3 list all element, 4 search a element, 5 exit)");
            sel = scanner.nextInt();
            switch (sel) {

                case 1:
                    System.out.print("pls u enter value: ");
                    data = scanner.nextInt();
                    nodeMenager.sortAddNode(new node(data));
                    break;
                case 2:
                    nodeMenager.list();
                    nodeMenager.deleteNode();
                    break;
                case 3:
                    if (nodeMenager.checkFirst())
                        System.out.println("this list null");
                    else {
                        nodeMenager.list();
                        System.out.println("reverse: ");
                        nodeMenager.reverseList();
                    }
                    break;
                case 4:
                    System.out.println(nodeMenager.searcNode().get_data());
                default:
                    break;
            }

        }
    }
}
