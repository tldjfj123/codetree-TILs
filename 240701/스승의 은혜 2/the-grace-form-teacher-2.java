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
        
        Arrays.sort(arr);

        int res = 0;
        for (int i = 0; i < N; i++) { // 할인할 학생 고르기
            int cnt = 0; // 사람 수
            int budget = B; // 예산
            int calc = 0; // 물품 값

            for (int j = 0; j < N; j++) { // 결제 
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