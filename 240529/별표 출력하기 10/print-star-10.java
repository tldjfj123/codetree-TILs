import java.util.*;

/*
0 1
2 2
4 3
6 4
*/

/*
1 4
3 3
5 2
7 1
*/


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int even = 1;
        int odd = n;

        for (int i = 0; i < 2*n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < even; j++) {
                    System.out.print("* ");
                }
                even++;
            } else {
                for (int k = 0; k < odd; k++) {
                    System.out.print("* ");
                }
                odd--;
            }
            System.out.println();
        }

    }
}