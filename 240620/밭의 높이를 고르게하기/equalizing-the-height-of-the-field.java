import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int H = sc.nextInt(); // 이상 높이
        int T = sc.nextInt(); // 번

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= N - T; i++) {
            int tmp = 0;
            for (int j = i; j < i+T; j++) {
                tmp += Math.abs(arr[j] - H);
            }
            min = Math.min(tmp, min);
        }

        System.out.println(min);
    }
}