import java.util.Scanner;

public class countingLatters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("pls u enter text: ");
        String text = scan.nextLine(), text1 = text;
        System.out.println("pls u enter finding latter: ");
        char latter = scan.next().charAt(0);
        scan.close();
        int i = text.indexOf(latter), j = 0;
        while (i < text.length()) {
            text1 = text.substring(i);
            i = text1.indexOf(latter) + i;
            i++;
            if (text1.indexOf(latter) == -1) {
                break;
            } else if (text1.length() != 0) {
                j++;
            }
        }
        System.out.printf("'%s' has '%d' pcs '%c'\n", text, j, latter);
    }

}