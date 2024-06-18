import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) { // 모이는 집
            int tmp = 0;
            for (int j = 0; j < n; j++) {
                tmp += Math.abs(i - j) * arr[j];
            }
            min = Math.min(tmp, min);
        }

        System.out.println(min);

    }
}