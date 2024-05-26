import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0) {
                res++;
                if (((i % 100 == 0) && (i % 400 != 0))) {
                    res--;
                }
            }
        }

        System.out.print(res);
    }
}