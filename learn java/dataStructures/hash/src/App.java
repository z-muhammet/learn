import java.io.IOException;
import java.util.Random;

public class App {
    public static void main(String[] args) throws IOException {
        hashmenager hash = new hashmenager();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            hash.chaining(random.nextInt(10000) + 1);
        }
        for (int i = 0; i < 100; i++) {
            hash.linearHash(random.nextInt(10000) + 1, hash.hashmaplinear);
        }
        for (int i = 0; i < 100; i++) {
            hash.quadratic(random.nextIn(10000) + 1);
        }
        System.out.println("breakpoint");
        // this is clean code
    }
}
