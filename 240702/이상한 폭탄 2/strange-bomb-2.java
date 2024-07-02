import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // N == K -> 폭발 범위가 전체인 경우

        // System.out.println(Arrays.toString(arr));

        int res = -1;
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = i+1; j < N; j++) {
                cnt++;

                if (cnt <= K && arr[i] == arr[j]) {
                    res = Math.max(res, arr[i]);
                }
            }
        }


        System.out.println(res);
    }
}