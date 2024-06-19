import java.util.*;

public class Main {
    static int S, N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        S = sc.nextInt();
        N = sc.nextInt();

        int[] arr = new int[S];

        //합 구해놓기
        int sum = 0;
        for (int i = 0; i < S; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // 숫자 2개를 합에서 빼기
        int gap = N;
        for (int i = 0; i < S; i++) {
            for (int j = i+1; j < S; j++) {
                int v = sum - (arr[i] + arr[j]);

                gap = Math.min(gap, (int)Math.abs(N - v));
            }
        }

        System.out.println(gap);
    }
}