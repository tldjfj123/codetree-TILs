import java.util.*;

public class Main {
    static int res;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                res = sc.nextInt();
            } else {
                int v = sc.nextInt();
                res = res * v / gcd(res, v);
            }
        }

        System.out.println(res);
    }

    static int gcd(int p, int q)
        {
            if (q == 0) return p;
            return gcd(q, p%q);
        }
}