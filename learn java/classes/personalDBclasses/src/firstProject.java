import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class firstProject {

    public static void main(String[] args) throws IOException {
        try (Scanner scan = new Scanner(System.in)) {
            String pid, Personalname, Personalsurname, Personalposition, PersonalId;
            double wage;
            int Sel = 0, timer = 0;
            File hebele = new File("hebele.txt");
            if (!hebele.exists()) {
                hebele.createNewFile();
            }
            while (Sel != 4) {
                System.out.print(
                        "Pls u Select (add new personal press '1', for list personals '2',for edit personal '3', for exit '4'): ");
                Sel = scan.nextInt();
                if (Sel <= 4 && Sel > 0) {
                    switch (Sel) {
                        case 1:
                            System.out.println("pls u enter Personal ID: ");
                            PersonalId = scan.next();
                            System.out.println("pls u enter Personal Name: ");
                            Personalname = scan.next();
                            System.out.println("pls u enter Personal Surname: ");
                            Personalsurname = scan.next();
                            System.out.println("pls u enter Personal Positiion: ");
                            Personalposition = scan.next();
                            System.out.println("pls u enter Personal wage: ");
                            wage = scan.nextDouble();
                            menage.add(hebele, PersonalId, Personalname, Personalsurname, Personalposition, wage);
                            timer++;
                            break;
                        case 3:
                            menage.list(hebele, timer);
                            System.out.print("pls u enter personal id: ");
                            pid = scan.next();
                            menage.edit(hebele, timer, pid);
                            break;

                        case 2:
                            menage.list(hebele, timer);
                            break;
                        case 4:
                            System.out.println("Good lucky");
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }
}