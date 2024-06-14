import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 학생 수
        int M = sc.nextInt(); // 내역 
        int K = sc.nextInt(); // 데카
        
        int[] arr = new int[N];

        int res = -1;
        for (int i = 0; i < M; i++) {
            // System.out.println(Arrays.toString(arr));
            int v = sc.nextInt();
            
            arr[v-1]++;

            if (arr[v-1] >= K) {
                res = v;
            }
        }

        System.out.println(res);
    }
}