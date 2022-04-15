import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        queue queue = new queue();
        /*
         * int sel = 0;
         * while (sel != 4) {
         * System.out.
         * print("pls u select add queue (1) get queue (2) priority queue (3) exit (4): "
         * );
         * sel = scanner.nextInt();
         * switch (sel) {
         * case 1:
         * System.out.print("pls u enter next queue element: ");
         * queue.addQueue(new node(scanner.nextInt()));
         * break;
         * case 2:
         * queue.getQueue();
         * break;
         * case 3:
         * System.out.print("pls u enter priority queue element: ");
         * queue.priority(new node(scanner.nextInt()));
         * break;
         * default:
         * System.out.println("good luck...");
         * break;
         * }
         * }
         */
        queue.enquee(new node(5, "5bbb"));
        queue.enquee(new node(6, "6ccc"));
        queue.enquee(new node(4, "4aaa"));
        queue.enquee(new node(9, "9fff"));
        queue.enquee(new node(5, "5bbb"));
        queue.enquee(new node(6, "6ccc"));
        queue.enquee(new node(4, "4aaa"));
        queue.enquee(new node(9, "9fff"));
        queue.enquee(new node(8, "8eee"));
        queue.enquee(new node(7, "7ddd"));
        queue.getQueue();
        queue.getQueue();
        queue.getQueue();
        queue.getQueue();
        queue.getQueue();
        queue.getQueue();
        queue.getQueue();
        queue.getQueue();
        queue.getQueue();
        queue.getQueue();
        queue.getQueue();
        queue.getQueue();

    }

}
