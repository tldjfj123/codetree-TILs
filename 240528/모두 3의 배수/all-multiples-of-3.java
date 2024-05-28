import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int res = 1;

        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();

            if (n % 3 != 0) {
                res = 0;
                break;
            }
        }

        System.out.print(res);
    }
}