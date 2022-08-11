import java.io.IOException;
import java.util.Random;

public class App {
    public static void main(String[] args) throws IOException {
        hashmenager hash = new hashmenager();
        Random random = new Random();

        hash.quadratic(5);
        hash.quadratic(8);
        hash.quadratic(12);
        hash.quadratic(13);
        hash.quadratic(6);
        hash.quadratic(14);
        hash.quadratic(20);

        System.out.println("breakpoint");
        // this is clean code
    }
}
