import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n+1];

        for (int i = 0; i < k; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();

            for (int j = s; j <= e; j++) {
                arr[j]++;
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.print(max);
    }
}