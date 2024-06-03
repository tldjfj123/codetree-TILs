import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int v = 1;
        // part1
        for (int i = 0; i < m+n; i++) {
            for (int j = 0; j <= i; j++) {
                if (0 <= j && j < n && 0 <= i-j && i-j < m) {
                    arr[j][i-j] = v;
                    v++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



    }
}