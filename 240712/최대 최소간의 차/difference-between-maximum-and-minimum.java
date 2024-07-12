import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        
        int mi = Integer.MAX_VALUE;
        int ma = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            arr[i] = v;
            mi = Math.min(v, mi);
            ma = Math.max(v, ma);
        }

        if (ma - mi <= k) {
            System.out.println(0);
            return;
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