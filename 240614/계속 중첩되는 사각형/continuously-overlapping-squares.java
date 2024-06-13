import java.util.*;

public class Main {
    static final int OFFSET = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[201][201];

        for (int t = 0; t < n; t++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;

            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            //0 : 기본, 1 : 빨강, 2 : 파랑
            for (int i = x1; i < x2; i++) {
                for (int j = y1; j < y2; j++) {
                    if (t % 2 == 0) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = 2;
                    }
                }
            }

        }

        int cnt = 0;
        for (int i = 0; i < 201; i++) {
            for (int j = 0; j < 201; j++) {
                if (arr[i][j] == 2) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        
    }
}