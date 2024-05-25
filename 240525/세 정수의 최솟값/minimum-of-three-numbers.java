import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && c >= b) {
            System.out.println(b);
        }

        if (a >= c && b >= c) {
            System.out.println(c);
        }

        if (b >= a && c >= a) {
            System.out.println(a);
        }
    }
}