import java.util.*;

public class Main {
    static int n;
    static int[][] arr;

    static boolean inRange(int x, int y) {
        if (0 <= x && x < n && 0 <= y && y < n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= n-3; i++) {
            for (int j = 0; j <= n-3; j++) {
                int v = 0;
                for (int k = i; k < i+3; k++) {
                    for (int l = j; l < j+3; l++) {
                        v += arr[k][l];
                    }
                }

                max = Math.max(max, v);
            }
        }

        System.out.println(max);


    }
}