import java.util.*;

class Dot {
    int x1; 
    int y1;
    int x2;
    int y2;

    public Dot(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   

        Dot[] arr = new Dot[n];
        int[][] board = new int[200][200];

        int offset = 0;
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

            arr[k] = new Dot(x1, y1, x2, y2);
        }
        
        offset *= -1;

        for (Dot a : arr) {
            for (int i = a.x1 + offset; i < a.x2 + offset; i++) {
                for (int j = a.y1 + offset; j < a.y2 + offset; j++) {
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