import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[10001];

        for (int i = 0; i < N; i++) {
            int idx = sc.nextInt()-1;
            String s = sc.next();

            if (s.equals("G")) {
                arr[idx] = 1;
            } else {
                arr[idx] = 2;
            }
        }

        // System.out.println(Arrays.toString(arr));
        // for (int i = 0; i <3; i++) {
        //     System.out.println(arr[i]);
        // }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= 10000 - K; i++) {
            int tmp = 0;
            for (int j = i; j <= i+K; j++) {
                tmp += arr[j];
            }
            max = Math.max(tmp, max);
        }

        System.out.println(max);
    }
}