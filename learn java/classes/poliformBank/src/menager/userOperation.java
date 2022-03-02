package menager;

import java.util.Scanner;

public class userOperation {
    private static double mainEnterDouble;
    private static String mainEnterString;

    public String mainEnterString(String type) {
        Scanner scan = new Scanner(System.in);
        System.out.print("pls u enter person's " + type + ": ");
        userOperation.mainEnterString = scan.next();
        return mainEnterString;
    }

    public double mainEnterDouble(String type) {
        Scanner scan = new Scanner(System.in);
        System.out.print("pls u enter person's " + type + ": ");
        userOperation.mainEnterDouble = scan.nextDouble();
        return mainEnterDouble;
    }

}
