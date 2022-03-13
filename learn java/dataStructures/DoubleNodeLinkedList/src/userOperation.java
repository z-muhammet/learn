import java.util.Scanner;

public class userOperation {
    private int dataInt;
    private String dataString;

    public int getint(String getmessage) {
        System.out.print(getmessage);
        Scanner scanner = new Scanner(System.in);
        int returnInt = scanner.nextInt();
        return returnInt;
    }

    public String getString(String getMessage) {
        System.out.print(getMessage);
        Scanner scanner = new Scanner(System.in);
        String retunString = scanner.nextLine();
        return retunString;
    }
}
