import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 원소의 갯수
        int K = sc.nextInt(); // 차이값의 최대

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        
        // System.out.println(Arrays.toString(arr));

        int res = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int cnt = 1;

            for (int j = i+1; j < N; j++) {
                if (arr[j] - arr[i] <= K) {
                    cnt++;
                } else {
                    break;
                }
            }

            res = Math.max(cnt, res);
        }
        

        System.out.println(res);


    }
}