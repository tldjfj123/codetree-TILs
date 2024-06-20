import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n-k; i++) {
            int tmp = 0;
            for (int j = i; j < i + k; j++) {
                tmp += arr[j];
            }
            max = Math.max(tmp, max);
        }

        System.out.println(max);

    }
}