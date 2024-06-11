import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        int offset = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();

            if (s < 0 && (int)Math.abs(s) > offset) {
                offset = (int)Math.abs(s);
            }

            arr[i] = new int[]{s, e-1};
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i][0] += offset;
            arr[i][1] += offset;

            if (arr[i][1] > max) {
                max = arr[i][1];
            }
        }

        int[] res = new int[max];

        for (int i = 0; i < n; i++) {
            int a = arr[i][0];
            int b = arr[i][1];

            for (int j = a; j < b; j++) {
                res[j]++;
            }
        }

        int fin = Integer.MIN_VALUE;

        for (int i = 0; i < res.length; i++) {
            if (fin < res[i]) {
                fin = res[i];
            }
        }

        System.out.print(fin);


        
    }
}