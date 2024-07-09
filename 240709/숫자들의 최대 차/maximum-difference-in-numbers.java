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

        int idx = 1;
        
        while (true) {
            if (arr[idx] - arr[0] <= K) {
                idx++;
            } else {
                break;
            }
        }

        System.out.println(idx);


    }
}