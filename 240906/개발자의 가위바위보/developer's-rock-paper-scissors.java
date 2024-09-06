import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < n; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();

            if (left < right) {
                cnt1++;
            } else if (left > right) {
                cnt2++;
            }
        }

        System.out.println(Math.max(cnt1, cnt2));
    }
}