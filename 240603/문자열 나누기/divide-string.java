import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = "";

        for (int i = 0; i < n; i++) {
            s += sc.next();
        }

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            if (i % 5 == 4) {
                System.out.println();
            }
        }
    }
}