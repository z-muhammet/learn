import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        stack stack = new stack();
        int sel = 0;
        while (sel != 5) {
            System.out.print(
                    "pls u select |add element (1)| get element (2)| size stack (3)| get element but dont delete (4) |exit (5)|: ");
            sel = scanner.nextInt();
            switch (sel) {
                case 1:
                    System.out.print("pls u enter elements data: ");
                    stack.addStackElement(new node(scanner.nextInt()));
                    break;
                case 2:
                    node tempNode = stack.pop();
                    if (tempNode != null)
                        System.out.println(tempNode.getData());
                    else
                        System.out.println("this list haven't a element");
                    break;
                case 3:
                    System.out.println("this list have " + stack.sizeOfList() + " element");
                    break;
                case 4:
                    if (stack.peek() != null)
                        System.out.println(stack.peek().getData());
                    else
                        System.out.println("this list haven't a element");
                    break;
                default:
                    System.out.println("good luck...");
                    break;
            }
        }
    }
}
