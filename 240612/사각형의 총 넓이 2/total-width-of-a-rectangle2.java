import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   

        int offset = 0;

        int[][] arr = new int[n][2];
        int[][] board = new int[200][200];


        for (int k = 0; k < n; k++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            if (x1 < 0) {
                offset = Math.min(offset, x1);
            }

            if (y1 < 0) {
                offset = Math.min(offset, y1);
            }

            for (int i = x1 + offset; i < x2 + offset; i++) {
                for (int j = y1 + offset; j < y2 + offset; j++) {
                    board[i][j] = 1;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 200; j++) {
                if (board[i][j] == 1) {
                    cnt++;
                }
            }
        }

        System.out.print(cnt);

        

    }
}