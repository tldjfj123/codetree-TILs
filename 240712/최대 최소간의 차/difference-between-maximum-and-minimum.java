import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            arr[i] = v;

            min = Math.min(min, v);
            max = Math.max(max, v);
        }
        
        int res = 0;
        for (int i = min; i <= max - k; i++) {
            int start = i;
            int end = i + k;

            int tmp = 0;
            for (int j = 0; j < n; j++) {
                tmp += Math.min(Math.abs(arr[j] - start), Math.abs(arr[j] - end));
            }

            res = Math.min(tmp, res);
        }

        System.out.println(res);
    }
}