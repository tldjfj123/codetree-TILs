import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(getPow(a, b));
    }

    static int getPow(int a, int b) {
        int prod = 1;

        for (int i = 0; i < b; i++) {
            prod *= a;
        }

        return prod;
    }
}