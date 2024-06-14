import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }       

        int cnt = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            //둘이 부호가 같다 == 둘 곱이 양수
            if (i == 0 || (arr[i] * arr[i-1]) > 0) {
                cnt++;
                max = Math.max(cnt, max);
            } else {
                cnt = 1;
            }
        }

        System.out.println(max);
    }
}