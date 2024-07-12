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
        for (int t = 0; t <= k; t++) { // 차이값
            for (int i = 1; i <= 10000 - t; i++) {
                int start = i;
                int end = i + t;

                int sum = 0;
                for (int j = 0; j < n; j++) {
                    sum += Math.min(Math.abs(arr[j] - start), Math.abs(arr[j] - end));
                }

                res = Math.min(res, sum);
                
            }
        }

        System.out.println(res);
    }
}