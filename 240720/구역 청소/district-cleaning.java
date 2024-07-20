import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] arr = new boolean[101];

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        for (int i = a; i < b; i++) {
            arr[i] = true;
        }

        for (int i = c; i < d; i++) {
            arr[i] = true;
        }

        int cnt = 0;
        for (int i = 0; i <= 100; i++) {
            if (arr[i]) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}