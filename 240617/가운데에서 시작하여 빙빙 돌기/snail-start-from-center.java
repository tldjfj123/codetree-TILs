import java.util.*;

/*
역발상!
25부터 시작해서 뺑뻉이 돌리자!
*/

public class Main {
    static int[] dx = {0, -1, 0, 1}; //W N E S
    static int[] dy = {-1, 0, 1, 0};
    static int n;
    static int[][] arr;

    public static boolean inRange(int x, int y) {
        if (0 <= x && x < n && 0 <= y && y < n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        arr = new int[n][n];

        int x = n - 1;
        int y = n - 1;
        int v = n * n;
        int idx = 0;

        arr[x][y] = v;

        while (true) {
            if (v == 1) {
                break;
            }

            // System.out.println(x + " " + y);

            int nx = x + dx[idx];
            int ny = y + dy[idx];

            if (inRange(nx, ny)) {
                if (arr[nx][ny] == 0) {
                    v--;
                    x = nx;
                    y = ny;
                    arr[nx][ny] = v;
                } else {
                    idx++;

                    if (idx > 3) {
                        idx = 0;
                    }

                }
            } else {
                idx++;

                if (idx > 3) {
                    idx = 0;
                }
            }
        }

        // System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}