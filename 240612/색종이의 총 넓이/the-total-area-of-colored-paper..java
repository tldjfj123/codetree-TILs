import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int offset = 100;
        int[][] board = new int[201][201];

        int N = sc.nextInt();

        for (int t = 0; t < N; t++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int i = x + offset; i < x + offset + 8; i++) {
                for (int j = y + offset; j < y + offset + 8; j++) {
                    board[i][j] = 1;
                }
            }
        }

        

        int cnt = 0;

        for (int i = 0; i < 201; i++) {
            for (int j = 0; j < 201; j++) {
                if (board[i][j] == 1) {
                    cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}