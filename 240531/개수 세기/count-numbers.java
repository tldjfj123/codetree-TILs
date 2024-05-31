import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();

            if (input == m) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}