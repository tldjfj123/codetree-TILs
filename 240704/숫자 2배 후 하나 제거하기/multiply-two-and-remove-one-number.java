import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) { // 곱하기할거랑 뺄거 정하기 (i != j)
                if (i == j) {
                    continue;
                }

                // i : 곱할거, j : 뺄거
                int[] tmp = Arrays.copyOf(arr, arr.length);
                tmp[i] *= 2;

                int[] s = new int[N-1];

                int idx = 0;
                for (int k = 0; k < N; k++) {
                    if (k != j) {
                        s[idx] = tmp[k];
                        idx++;
                    }
                }

                int sum = 0;
                for (int k = 0; k < s.length-1; k++) {
                    sum += Math.abs(s[k+1] - s[k]);
                }

                res = Math.min(res, sum);
            }
        }

        System.out.println(res);
    }
}