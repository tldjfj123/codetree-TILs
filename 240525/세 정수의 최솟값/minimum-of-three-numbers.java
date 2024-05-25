import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int res = 0;

        if (a >= b && c >= b) {
            res = b;
        }

        if (a >= c && b >= c) {
            res = c;
        }

        if (b >= a && c >= a) {
            res = a;
        }

        System.out.println(res);
    }
}