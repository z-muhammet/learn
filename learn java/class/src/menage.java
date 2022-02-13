import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class menage {
    public static void add(File fname, String PersonalId, String name, String surname, String position, Double wage)
            throws IOException {
        FileWriter fileWriter = new FileWriter(fname, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.printf("id: %s name: %s surname: %s position: %s wage: %.3f \n", PersonalId, name, surname,
                position, wage);
        fileWriter.close();
        printWriter.close();
    }

    public static void list(File fname, int timer) throws IOException {
        String cont2[] = new String[timer], cont, Pid[] = new String[25], Pname[] = new String[25],Psurname[] = new String[25], Pposition[] = new String[25];
        double Pwage[] = new double[25];
        int i = 0;
        Scanner fileScanner = new Scanner(fname);
        for (; i < timer; i++) {
            cont = fileScanner.nextLine();
            cont2 = cont.split(" ");
            for (int j = 1; j <= 9; j += 2) {
                switch (j) {
                    case 1:
                        Pid[i]=cont2[j];
                        break;
                    case 3:
                        Pname[i]=cont2[j];
                        break;
                    case 5:
                        Psurname[i]=cont2[j];
                        break;
                    case 7:
                        Pposition[i]=cont2[j];
                        break;
                    case 9:
                        
                        Pwage[i]= Double.parseDouble(cont2[j].replace(',', '.'));
                        break;
                    default:
                        break;
                }
            }
        }
        fileScanner.close();
    }
}
