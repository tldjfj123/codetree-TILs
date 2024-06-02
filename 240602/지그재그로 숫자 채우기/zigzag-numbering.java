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
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int v = 0;

        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    arr[j][i] = v;
                    v++;
                }
            } else {
                for (int j = n-1; j > -1; j--) {
                    arr[j][i] = v;
                    v++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}