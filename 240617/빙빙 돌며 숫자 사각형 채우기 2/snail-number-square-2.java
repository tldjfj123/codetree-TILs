import java.util.*;

public class Main {
    static int[] dx = {1, 0, -1, 0}; //S E N W
    static int[] dy = {0, -1, 0, 1};
    static int n; //격자 행
    static int m; //격자 열
    static int[][] arr;

    public static boolean inRange(int x, int y) {
        if (0 <= x && x < n && 0 <= y && y < m) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n][m];

        int v = 1;
        int x = 0;
        int y = 0;
        int idx = 0;
        int cnt = 0;

        while (true) {
            arr[x][y] = v;

            if (v == n * m) {
                break;
            }

            int nx = x + dx[idx];
            int ny = y + dy[idx];

            if (inRange(nx, ny)) {
                if (arr[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                    v++;
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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }




    }
}