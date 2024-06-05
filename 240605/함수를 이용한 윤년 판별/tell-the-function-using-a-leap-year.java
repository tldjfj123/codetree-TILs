import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(check(n));
    }

    static boolean check(int n) {
        if (n % 4 == 0 || (n % 100 == 0 && n % 400 != 0)) {
            return true;
        }
        return false;
    }
}