package menager;

import java.util.Scanner;

public class userOperation {
    private static double mainEnterDouble;
    private static String mainEnterString;

    private void mainEnterString(String type) {
        Scanner scan = new Scanner(System.in);
        System.out.print("pls u enter person's " + type + ": ");
        userOperation.mainEnterString = scan.next();
    }

    private void mainEnterDouble(String type) {
        Scanner scan = new Scanner(System.in);
        System.out.print("pls u enter person's " + type + ": ");
        userOperation.mainEnterDouble = scan.nextDouble();
    }

    public String enterID() {
        mainEnterString("Id");
        return userOperation.mainEnterString;
    }

    public String enterName() {
        mainEnterString("Name");
        return userOperation.mainEnterString;
    }

    public String enterSurname() {
        mainEnterString("SurName");
        return userOperation.mainEnterString;
    }

    public String enterPosition() {
        mainEnterString("Position");
        return userOperation.mainEnterString;
    }

    public String enterRank() {
        mainEnterString("Rank");
        return userOperation.mainEnterString;
    }

    public double enterwage() {
        mainEnterDouble("Wage");
        return userOperation.mainEnterDouble;
    }

    public double enterDebt() {
        mainEnterDouble("Debt");
        return userOperation.mainEnterDouble;
    }
}
