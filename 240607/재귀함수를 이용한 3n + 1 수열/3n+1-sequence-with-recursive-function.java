import java.util.*;

public class Main {
    static int n, cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        calc(n);
        System.out.print(cnt);
    }

    static int calc(int n) {
        if (n == 1) {
            return 1;
        }

        if (n % 2 == 0) {
            cnt++;
            return calc(n / 2);
        } else {
            cnt++;
            return calc((3 * n) + 1);
        }
    }
}