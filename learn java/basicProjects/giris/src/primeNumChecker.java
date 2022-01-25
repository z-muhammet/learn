import java.util.Scanner;

public class primeNumChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char repeat = 'y';
        String result="this is not a prime number and this is a prime number";
        do{
            System.out.println("pls u enter number to check: ");
            int checkPrime = scan.nextInt();
            for (int i = 2; i < checkPrime; i++) {
                if (checkPrime % i == 0) {
                    result = "not a prime number";
                    break;
                } 
                else {
                    result = "a prime number";
                }
            }
            if(checkPrime<=2)
            switch (checkPrime) {
                case 2:result="this is a prime number";
                break;
                case 1: result="this is not a prime number";
                break;
                default:result="You entered 0 or a negative number";
                break;
            }
            System.out.printf("'%d' %s\n",checkPrime ,result);
            System.out.println("if u need check a new number press 'y'");
            repeat= scan.next().charAt(0);
        }while(repeat =='y' || repeat=='Y');
        scan.close();
    }

}