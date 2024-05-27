import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            String s = sc.next();

            System.out.println(w * h);

            if (s.equals("C")) {
                break;
            }
        }
    }
}