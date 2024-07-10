import java.util.*;

public class Main {
    static int n, k;
    static int[] arr;

    public static boolean isPossible(int minVal) {
        int[] check = new int[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > minVal) {
                check[cnt++] = i;
            }
        }

        // System.out.println(Arrays.toString(check));

        for (int i = 1; i < cnt; i++) {
            int d = arr[i] - arr[i-1];
            if (d > k) {
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int res = 0;

        for (int i = 1; i <= n; i++) { // 최솟값
            if (isPossible(i)) {
                res = Math.max(res, i);
            }
        }

        System.out.println(res);


        
    }
}