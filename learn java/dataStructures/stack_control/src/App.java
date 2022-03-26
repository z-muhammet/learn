import java.io.IOException;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws IOException {
        Stack stack = new Stack<>();

        String hebele = "(()())((()()())";
        nodemenager nodemenager = new nodemenager();
        for (int i = 0; i < hebele.length(); i++) {
            if (hebele.substring(i, i + 1).equals("(")) {
                nodemenager.addStack(new node(hebele.substring(i, i + 1)));
            }

            if (hebele.substring(i, i + 1).equals(")")) {
                nodemenager.peek();
            }
        }
        System.out.println(nodemenager.checkList());
    }
}
