import java.util.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0}; // 상 하 좌 우
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[100][100];

        int x = 0;
        int y = 0;
        int t = 0;

        boolean flag = false;
        for (int i = 0; i < N; i++) {
            String order = sc.next();
            int v = sc.nextInt();

            if (order.equals("N")) {
                for (int j = 0; j < v; j++) {
                    x += dx[0];
                    y += dy[0];
                    t++;

                    if(x == 0 && y == 0) {
                        flag = true;
                        break;
                    }
                }

            } else if (order.equals("S")) {
                for (int j = 0; j < v; j++) {
                    x += dx[1];
                    y += dy[1];
                    t++;

                    if(x == 0 && y == 0) {
                        flag = true;
                        break;
                    }
                }
            } else if (order.equals("W")) {
                for (int j = 0; j < v; j++) {
                    x += dx[2];
                    y += dy[2];
                    t++;

                    if(x == 0 && y == 0) {
                        flag = true;
                        break;
                    }
                }
            } else {
                for (int j = 0; j < v; j++) {
                    x += dx[3];
                    y += dy[3];
                    t++;

                    if(x == 0 && y == 0) {
                        flag = true;
                        break;
                    }
                }
            }

            if (flag) {
                break;
            }
        } // for

        if (flag) {
            System.out.println(t);
        } else {
            System.out.println(-1);
        }
    }
}