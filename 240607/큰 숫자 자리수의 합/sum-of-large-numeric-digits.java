import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prod = 1;

        for (int i = 0; i < 3; i++) {
            prod *= sc.nextInt();
        }

        System.out.print(calc(prod));
    }

    static int calc(int n) {
        if (n < 10) {
            return n;
        }

        return calc(n / 10) + (n % 10);
    }
}