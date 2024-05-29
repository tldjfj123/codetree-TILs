import java.util.*;

/*
00
01
02
03
13
12
11
10
20
21
22
23
33
32
31
30
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = cnt;
                    cnt++;
                }
            } else {
                for (int k = n-1; k > -1; k--) {
                    arr[i][k] = cnt;
                    cnt++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}