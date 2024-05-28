import java.util.*;

/*
0 0 5
1 1 3
2 2 1
3 1 3
4 0 5
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < (2 * n) - (2 * i) - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 2; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 3 + (2 * i); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}