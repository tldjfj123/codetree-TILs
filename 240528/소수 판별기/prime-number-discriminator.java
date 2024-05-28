import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String res = "P";

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                res = "C";
            }
        }

        System.out.print(res);
    }
}