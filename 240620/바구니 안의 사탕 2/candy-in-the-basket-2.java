import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //사탕의 갯수
        int K = sc.nextInt(); //배열 범위

        int[] arr = new int[200];

        for (int i = 0; i < N; i++) {
            int v = sc.nextInt();
            int point = sc.nextInt()-1;

            arr[point] += v;
        }
        
        int max = Integer.MIN_VALUE;
        //구심점 잡고 순회
        for (int i = K; i < 200; i++) {
            int tmp = 0;
            int start = i - K;
            int end = i + K;
            
            if (end > 199) {
                end = 199;
            }
            
            for (int j = start; j <= end; j++) {
                tmp += arr[j];
            }
            
            max = Math.max(max ,tmp);
        }

        System.out.println(max);

    }
}