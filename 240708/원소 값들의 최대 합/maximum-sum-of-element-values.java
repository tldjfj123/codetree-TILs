import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) { // 시작점
            int tmp = 0; // 움직임 합 계산 변수
            int idx = i;
            for (int j = 0; j < m; j++) {
                int v = arr[idx];
                idx = v;
                tmp += v;
            }

            res = Math.max(res, tmp);
        }   

        System.out.println(res);
    }
}