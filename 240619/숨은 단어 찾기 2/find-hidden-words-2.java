import java.util.*;

public class Main {
    static int N, M;
    static char[][] arr;
    static int[] dx = {1, 1, 0};
    static int[] dy = {0, 1, 1};

    public static boolean inRange(int x, int y) {
        if (0 <= x && x < N && 0 <= y && y < M) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new char[N][M];

        for (int i = 0; i < N; i++) {
            String s = sc.next();
            char[] c = s.toCharArray();

            for (int j = 0; j < M; j++) {
                arr[i][j] = c[j];
            }
        }

        int cnt = 0;

        for (int i = 0; i < N; i++) { //x
            for (int j = 0; j < M; j++) { //y
                for (int k = 0; k < dx.length; k++) { //dxdy 방향으로 탐색
                    int cntL = 0;
                    int cntE = 0;

                    for (int t = 0; t < 3; t++) {
                        int nx = i + (dx[k] * t);
                        int ny = j + (dy[k] * t);
                        if (inRange(nx, ny)) {
                            // System.out.println(nx + " " + ny);
                            if (arr[nx][ny] == 'L') {
                                cntL++;
                            }
                            if (arr[nx][ny] == 'E') {
                                cntE++;
                            }
                        }
                        
                    }
                    
                    if (cntL == 1 && cntE == 2) {
                        cnt++;
                    }
                    
                }


            }
        }

        System.out.println(cnt);

    }
}