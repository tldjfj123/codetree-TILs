import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0}; //상 우 하 좌
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] orders = sc.next().toCharArray();
        
        int d = 0;
        int x = 0;
        int y = 0;

        int cnt = 0;
        int res = -1;

        for (int i = 0; i < orders.length; i++) {
            cnt++;

            if (orders[i] == 'L') { 
                d--;
                if (d < 0) {
                    d = 3;
                }
            } else if (orders[i] == 'R') {
                d++;
                if (d > 3) {
                    d = 0;
                }
            } else {
                x += dx[d];
                y += dy[d];
            }

            if (x == 0 && y == 0) {
                res = cnt;
                break;
            }
        }

        System.out.println(res);
    }
}