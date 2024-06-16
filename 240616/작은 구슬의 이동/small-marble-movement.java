import java.util.*;

public class Main {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {-1, 1, 0, 0};

    public static boolean inRange(int x, int y, int limit) {
        if (0 <= x && x < limit && 0 <= y && y < limit) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 격자 크기
        int t = sc.nextInt(); // 시간

        int r = sc.nextInt()-1; // 시작 x값
        int c = sc.nextInt()-1; // 시작 y값
        String d = sc.next(); // U, D, R, L

        for (int i = 0; i < t; i++) {
            if (d.equals("U")) {
                int nx = r + dx[0];
                int ny = c + dy[0];

                if (inRange(nx, ny, n)) {
                    r = nx;
                    c = ny;
                } else {
                    d = "D";
                }
            } else if (d.equals("D"))  {
                int nx = r + dx[1];
                int ny = c + dy[1];

                if (inRange(nx, ny, n)) {
                    r = nx;
                    c = ny;
                } else {
                    d = "U";
                }
            } else if (d.equals("R")) {
                int nx = r + dx[2];
                int ny = c + dy[2];

                if (inRange(nx, ny, n)) {
                    r = nx;
                    c = ny;
                } else {
                    d = "L";
                }
            } else {
                int nx = r + dx[3];
                int ny = c + dy[3];

                if (inRange(nx, ny, n)) {
                    r = nx;
                    c = ny;
                } else {
                    d = "R";
                }
            }
        }

        System.out.println(c + " " + r);


    }
}