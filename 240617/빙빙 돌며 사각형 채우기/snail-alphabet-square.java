import java.util.*;

public class Main {
    static int[] dx = {0, 1, 0, -1}; // E S W N
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

        n = sc.nextInt(); //행
        m = sc.nextInt(); //열

        char[][] arr = new char[n][m];

        char[] alpha = new char[26];

        for (int i = 0; i < 26; i++) {
            alpha[i] = (char)('A' + i);
        }

        // System.out.println(Arrays.toString(alpha));

        int x = 0;
        int y = 0;
        int idx = 0;
        int aIdx = 0;
        int cnt = 0;


        while (true) {
            if (arr[x][y] == 0) {
                arr[x][y] = alpha[aIdx];
                cnt++;
            }
            
            if (cnt == n * m) {
                break;
            }

            int nx = x + dx[idx];
            int ny = y + dy[idx];

            if (inRange(nx, ny)) {
                if (arr[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                    aIdx++;

                    if (aIdx > 25) {
                        aIdx = 0;
                    }
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