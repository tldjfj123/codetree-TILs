import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //수열 A
        int M = sc.nextInt(); //수열 B

        int[] arrA = new int[N];
        int[] arrB = new int[M];

        for (int i = 0; i < N; i++) {
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            arrB[i] = sc.nextInt();
        }

        int cnt = 0;

        for (int i = 0; i <= N - M; i++) {
            boolean[] checked = new boolean[M];

            for (int j = i; j < i + M; j++) {
                // System.out.print(arrA[j] + " ");
                
                for (int k = 0; k < M; k++) {
                    if (arrA[j] == arrB[k]) {
                        checked[k] = true;
                    }
                }
                // System.out.println(Arrays.toString(checked));

                boolean flag = true;
                for (int k = 0; k < M; k++) {
                    if (!checked[k]) {
                        flag = false;
                    }
                }

                if (flag) {
                    cnt++;
                }

                
            }
            
        }
        System.out.println(cnt);



    }
}