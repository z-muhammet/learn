import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class firstProject {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String Personalname, Personalsurname, Personalposition, PersonalId;
        double wage;
        int Sel = 0;//timer=0;
        File hebele = new File("hebele.txt");
        if (!hebele.exists()) {
            hebele.createNewFile();
        }
        while (Sel != 3) {
            System.out.println("Pls u Select (add new personal press '1', for list personalss '2', for exit '3')");
           Sel= scan.nextInt();
            if (Sel <= 3 && Sel > 0) {
                switch (Sel) {
                    case 1:
                    System.out.println("pls u enter Personal Name: ");
                    Personalname =  scan.next();
                    System.out.println("pls u enter Personal ID: ");    
                    PersonalId = scan.next();
                    System.out.println("pls u enter Personal Surname: ");
                    Personalsurname =  scan.next();
                    System.out.println("pls u enter Personal Positiion: ");
                    Personalposition =  scan.next();
                    System.out.println("pls u enter Personal wage: ");
                    wage =  scan.nextDouble();
                    menage.add(hebele, PersonalId, Personalname, Personalsurname, Personalposition, wage);
                   // timer++;
                        break;
                    case 2:
                        menage.list(hebele,10);
                        break;

                    case 3:
                        System.out.println("Good lucky");
                        break;
                    default:
                        break;
                }
            }
        }

        
        scan.close();
    }
}