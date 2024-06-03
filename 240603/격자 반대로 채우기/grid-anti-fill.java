import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int v = 1;
        boolean check = true;

        for (int i = n-1; i > -1; i--) {
            if (check) {
                for (int j = n-1; j > -1; j--) {
                    arr[j][i] = v;
                    v++;
                }
                check = false;
            } else {
                for (int j = 0; j < n; j++) {
                    arr[j][i] = v;
                    v++;
                }
                check = true;
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}