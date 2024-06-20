import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //사탕의 갯수
        int K = sc.nextInt(); //배열 범위

        int[] arr = new int[101];

        for (int i = 0; i < N; i++) {
            int v = sc.nextInt();
            int point = sc.nextInt()-1;

            arr[point] += v;
        }
        
        int max = Integer.MIN_VALUE;
        //구심점 잡고 순회
        for (int i = K; i <= 100 - K; i++) {
            int tmp = 0;
            for (int j = i - K; j <= i + K; j++) {
                // System.out.print(j + " ");
                tmp += arr[j];
            }
            // System.out.println();
            max = Math.max(max ,tmp);
        }

        System.out.println(max);

    }
}