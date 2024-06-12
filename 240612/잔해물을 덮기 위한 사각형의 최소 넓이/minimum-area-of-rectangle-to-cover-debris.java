import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[2001][2001];

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        int offset = 0;

        if (x1 < 0) {
            offset = Math.min(x1, offset);
        }

        if (y1 < 0) {
            offset = Math.min(y1, offset);
        }

        if (x3 < 0) {
            offset = Math.min(x3, offset);
        }

        if (y3 < 0) {
            offset = Math.min(y3, offset);
        }

        offset *= -1;
        
        int cnt = 0;
        for (int i = x1 + offset; i < x2 + offset; i++) {
            for (int j = y1 + offset; j < y2 + offset; j++) {
                board[i][j] = 1;
                cnt++;
            }
        }

        for (int i = x3 + offset; i < x4 + offset; i++) {
            for (int j = y3 + offset; j < y4 + offset; j++) {
                if (board[i][j] == 1) {
                    cnt--;
                }
            }
        }

        if (cnt == 0) {
            System.out.print(0);
        } else {
            System.out.print((int)Math.abs(x2 - x1) * Math.abs(y2 - y1));
        }
        

    }
}