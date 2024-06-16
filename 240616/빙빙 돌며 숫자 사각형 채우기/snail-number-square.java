import java.util.*;

public class Main {
    static int[][] arr;
    static int[] dx = {0, 1, 0, -1}; //우 하 좌 상
    static int[] dy = {1, 0, -1, 0};
    static int n, m;

    public static boolean inRange(int x, int y) {
        if (0 <= x && x < n && 0 <= y && y < m) {
            return true;
        }

        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 행
        m = sc.nextInt(); // 열

        arr = new int[n][m];

        int v = 1;
        int d = 0; //방향

        int x = 0;
        int y = 0;
        
        for (int i = 0; i < n * m; i++) {
            arr[x][y] = v;
            v++;

            int nx = x + dx[d];
            int ny = y + dy[d];
            if (!inRange(nx, ny) || arr[nx][ny] != 0) {
                d++;
                if (d >= 4) {
                    d = 0;
                }
            }

            x = x + dx[d];
            y = y + dy[d];
            
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}