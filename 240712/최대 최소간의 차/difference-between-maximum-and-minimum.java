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
        
        int res = Integer.MAX_VALUE;
        for (int i = 1; i <= 10000 - k; i++) {
            int min = i;
            int max = i + k;

            int tmp = 0;
            for (int j = 0; j < n; j++) {
                tmp += Math.min(Math.abs(arr[j] - min), Math.abs(arr[j] - max));
            }

            res = Math.min(tmp, res);
        }

        System.out.println(res);
    }
}