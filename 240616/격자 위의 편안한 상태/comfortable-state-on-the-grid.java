import java.util.*;

public class Main {
    static int[][] arr;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n;

    static boolean inRange(int x, int y) {
        if (0 <= x && x < n && 0 <= y && y < n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); //격자 크기
        int m = sc.nextInt(); // 명령 수

        arr= new int[n][n];

        for (int i = 0; i < m; i++) {
            int r = sc.nextInt()-1;
            int c = sc.nextInt()-1;

            arr[r][c] = 1;

            int tmp = 0;
            for (int j = 0; j < 4; j++) {
                int nx = r + dx[j];
                int ny = c + dy[j];

                if (inRange(nx, ny)) {
                    if (arr[nx][ny] == 1) {
                        tmp++;
                    }
                }
            }

            if (tmp == 3) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        
    }//main
}