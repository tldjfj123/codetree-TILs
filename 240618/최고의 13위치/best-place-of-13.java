import java.util.*;

public class Main {
    static int n;

    public static boolean isOk(int y) {
        if (y + 2 < n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = 0;
                if (isOk(j)) {
                    for (int k = j; k < j + 3; k++) {
                        if (arr[i][k] == 1) {
                            tmp++;
                        }
                    }
                }
                max = Math.max(max, tmp);
            }
        }

        System.out.println(max);
        
    }
}