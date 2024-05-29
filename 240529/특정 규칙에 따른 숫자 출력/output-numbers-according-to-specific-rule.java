import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;

        for (int i = 0; i < n; i++) {
            //공백
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            //숫자
            for (int k = n - i; k > 0; k--) {
                System.out.print(cnt + " ");
                cnt++;
                if (cnt > 9) {
                    cnt = 1;
                }
            }
            System.out.println();
        }
    }
}