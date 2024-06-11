import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int N = Integer.MIN_VALUE;

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();

            if (e > N) {
                N = e;
            }

            arr[i] = new int[] {s, e};
        }

        int[] res = new int[N+1];
        
        for (int i = 0; i < n; i++) {
            for (int j = arr[i][0]; j <= arr[i][1]; j++) {
                res[j]++;
            }
        }        

        int fin = Integer.MIN_VALUE;
        for (int i = 0; i < res.length; i++) {
            if (res[i] > fin) {
                fin = res[i];
            }
        }

        System.out.print(fin);
    }
}