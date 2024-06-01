import java.util.*;

/*
00
10 11
20 21 22
30 31 32
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                sum += arr[i][j];
            }
        }

        System.out.print(sum);
    }
}