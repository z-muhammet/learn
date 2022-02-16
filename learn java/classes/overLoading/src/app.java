import java.io.IOException;
import java.util.Scanner;

public class app {
    public static void main(String[] args) throws IOException {
        System.out.println("welcome school automation");
        Scanner scanner = new Scanner(System.in);
        studyMenager studyMenager = new studyMenager();
        study study = new study();
        int select = 0, timer = 0;

        while (select != 5) {
            System.out.print(
                    "pls u select \npress '1' for add new student \npress '2' for list all student \npress '3' for a student's information\npress '4' for edit a student's information\npress '5' for exit: ");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    studyMenager.add(study, timer);
                    timer++;
                    break;
                case 2:
                    studyMenager.allListstudy(study, 0);
                    break;
                case 3:
                    studyMenager.studyInfo(study, studyMenager.find(study, userOperation.findId()));
                    break;
                case 4:
                    studyMenager.studyEdit(study, studyMenager.find(study, userOperation.findId()));
                    break;

                default:
                    break;
            }

        }
        scanner.close();
    }
}
