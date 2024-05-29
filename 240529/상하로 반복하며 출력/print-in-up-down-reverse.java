import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[] straight = new int[n];
        int[] reverse = new int[n];

        for (int i = 0; i < n; i++) {
            straight[i] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            reverse[i] = n - i;
        }

        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    arr[i][j] = straight[i];
                }
            } else {
                for (int i = 0; i < n; i++) {
                    arr[i][j] = reverse[i];
                }
            }
        }

        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val);
            }
            System.out.println();
        }
    }
}