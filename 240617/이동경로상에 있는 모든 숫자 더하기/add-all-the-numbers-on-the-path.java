import java.util.*;

public class Main {
    static int N;
    static int[] dx = {-1, 0, 1, 0}; //N E S W
    static int[] dy = {0, 1, 0, -1};
    static int[][] arr;

    public static boolean inRange(int x, int y) {
        if (0 <= x && x < N && 0 <= y && y < N) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 격자 크기
        int F = sc.nextInt();

        String s = sc.next();
        char[] orders = s.toCharArray();

        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // System.out.println(Arrays.deepToString(arr));

        int x = N / 2;
        int y = N / 2;
        int idx = 0; // 북쪽부터 시작
        int res = arr[x][y];

        for (char order : orders) {
            if (order == 'L') {
                idx--;

                if (idx < 0) {
                    idx = 3;
                }
            } else if (order == 'R') {
                idx++;

                if (idx > 3) {
                    idx = 0;
                }
            } else {
                int nx = x + dx[idx];
                int ny = y + dy[idx];

                if (inRange(nx, ny)) {
                    x = nx;
                    y = ny;

                    res += arr[nx][ny];
                }
            }
        }

        System.out.println(res);


    }
}