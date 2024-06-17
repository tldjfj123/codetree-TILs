import java.util.*;

class Start {
    int num;
    String order;
    int[] point;

    public Start(int num, String order, int[] point) {
        this.num = num;
        this.order = order;
        this.point = point;
    }
}

public class Main {
    static int n;
    static int[] dx = {-1, 0, 1, 0}; // N E S W
    static int[] dy = {0, 1, 0, -1};
    static int[] startDx = {0, 1, 0, -1};
    static int[] startDy = {1, 0, -1, 0};
    static int[][] arr;

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            char[] tmp = s.toCharArray();
            for (int j = 0; j < tmp.length; j++) {
                if (tmp[j] == '\\') {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 2;
                }
            }
        }

        int k = sc.nextInt();

        String[] direction = {"S", "E", "N", "W"};
        Start[] starts = new Start[n * 4];

        int idx = 0;
        int startX = 0;
        int startY = 0;
        int startIdx = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < n; j++) {
                if (j != 0) {
                    startX += startDx[startIdx];
                    startY += startDy[startIdx];
                }
                starts[idx] = new Start(idx + 1, direction[i], new int[]{startX, startY});
                idx++;
            }
            startIdx++;
        }

        Start start = starts[k - 1];
        int calcX = start.point[0];
        int calcY = start.point[1];
        int startDir = 0;

        if (start.order.equals("N")) {
            startDir = 0;
        } else if (start.order.equals("E")) {
            startDir = 1;
        } else if (start.order.equals("S")) {
            startDir = 2;
        } else {
            startDir = 3;
        }

        int cnt = 0;

        while (inRange(calcX, calcY)) {
            if (arr[calcX][calcY] == 1) { // Mirror '\'
                startDir = (startDir + 1) % 4;
            } else { // Mirror '/'
                startDir = (startDir + 3) % 4; // equivalent to startDir - 1 but wraps around
            }
            calcX += dx[startDir];
            calcY += dy[startDir];
            cnt++;
        }

        System.out.println(cnt);
    }
}