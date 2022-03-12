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
                    nodeMenager.addSortNewInt(new intNode(data));
                    break;
                case 2:
                    nodeMenager.listInt();
                    System.out.print("pls u enter deleted value: ");
                    data = scanner.nextInt();
                    nodeMenager.deleteInt(data);
                    break;
                case 3:
                    nodeMenager.listInt();
                    break;
                case 4:
                    nodeMenager.listInt();
                    System.out.print("pls u enter search value: ");
                    data = scanner.nextInt();
                    if (nodeMenager.searcbackIntNode(data).getNext() != null)
                        System.out.println("list have this: " + nodeMenager.searcbackIntNode(data).getData());
                    break;
                default:
                    break;
            }

        }
    }
}
