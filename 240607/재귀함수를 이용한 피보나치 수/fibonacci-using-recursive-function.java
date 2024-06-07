import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(calc(n));
    }

    static int calc(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 1;
        }

        return calc(n-1) + calc(n-2);

    }
}