import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int res = 0;

        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();

            if (n % 2 == 0) {
                res++;
            }
        }

        System.out.println(res);
    }
}