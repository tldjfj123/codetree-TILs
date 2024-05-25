import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        String res = score == 0 ? "failure" : "pass";

        System.out.println(res);
    }
}