import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 갯수
        int K = sc.nextInt(); // 길이

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int res = -1;
        for (int i = 0; i < N-K; i++) {
            for (int j = i; j <= i+K; j++) {
                if (i != j && arr[i] == arr[j]) {
                    int v = arr[i];
                    arr[i] = 0;
                    arr[j] = 0;
                    res = Math.max(res, v);
                }
            }
        }

        System.out.println(res);
    }
}