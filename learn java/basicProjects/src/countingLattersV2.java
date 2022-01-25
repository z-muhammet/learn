import java.util.Scanner;

public class countingLattersV2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("pls u enter text: ");
        String text = scan.nextLine(), text1 = text;
        text = text.toLowerCase();
        System.out.println("pls u enter finding latter: ");
        char latter = 97;
        scan.close();
        int i, j = 0;
        for (char k = 0; k <= 25; k++) {
            i = text.indexOf(latter);
            if (i != -1) {
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
                text1=text;i = 0;j = 0;
            }
            latter+=1;
        }
    }
}
