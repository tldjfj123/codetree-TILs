import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        getLcm(n, m);
    }

    public static void getLcm(int n, int m) {
        int start = Math.max(n, m);

        while (true) {
            if (start % m == 0 && start % n == 0) {
                break;
            }
            start++;
        }

        System.out.print(start);
    }
}