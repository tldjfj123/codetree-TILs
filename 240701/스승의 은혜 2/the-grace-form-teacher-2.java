import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int res = 0;
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            int budget = B;
            int calc = 0;

            for (int j = 0; j < N; j++) {
                if (i == j) {
                    calc = arr[j] / 2;        
                } else {
                    calc = arr[j];
                }

                if (budget >= calc) {
                    cnt++;
                    budget -= calc;
                }
            }

            res = Math.max(cnt, res);
            // System.out.println(arr[i] + " " + res);
        }

        System.out.println(res);


    }
}