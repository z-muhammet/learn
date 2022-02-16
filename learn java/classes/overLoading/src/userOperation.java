import java.util.Scanner;

public class userOperation {
    private static int number;
    private static String Name;
    private static String surName;
    private static String clas;
    private static boolean attendSchool;
    private static String id;

    public static String findId() {
        Scanner scan = new Scanner(System.in);
        System.out.print("pls u enter student's id: ");
        userOperation.id = scan.next();
        return userOperation.id;
    }

    public static int setNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("pls u enter student number: ");
        userOperation.number = scan.nextInt();
        return userOperation.number;
    }

    public static String setName() {
        Scanner scan = new Scanner(System.in);
        System.out.print("pls u enter student name: ");
        userOperation.Name = scan.next();
        return userOperation.Name;
    }

    public static String setSurName() {
        Scanner scan = new Scanner(System.in);
        System.out.print("pls u enter student SurName: ");
        userOperation.surName = scan.next();
        return userOperation.surName;
    }

    public static String setClas() {
        Scanner scan = new Scanner(System.in);
        System.out.print("pls u enter student class: ");
        userOperation.clas = scan.next();
        return userOperation.clas;
    }

    public static boolean setAttendSchool() {
        char control;
        boolean whilecontroller = true;
        Scanner scan = new Scanner(System.in);
        while (whilecontroller) {
            System.out.print("Does this student to attend school ? (Yes 'y' / No 'n'):");
            control = scan.next().charAt(0);
            if (control == 'y' || control == 'Y') {
                whilecontroller = false;
                userOperation.attendSchool = true;
            } else if (control == 'n' || control == 'N') {
                whilecontroller = false;
                userOperation.attendSchool = false;
            } else {
                System.out.println("pls u try again");
                whilecontroller = true;
            }
        }
        return userOperation.attendSchool;
    }

}
