import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (check(i)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    static boolean check(int n) {
        if (isPrime(n) && isSumEven(n)) {
            return true;
        }
        return false;
    }

    static boolean isSumEven(int n) {
        char[] arr = String.valueOf(n).toCharArray();

        int sum = 0;

        for (char c : arr) {
            sum += c - '0';
        }

        if (sum % 2 == 0) {
            return true;
        }
        return false;
    }

    static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}