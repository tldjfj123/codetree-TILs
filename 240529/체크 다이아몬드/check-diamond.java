import java.util.*;

/*
0 2 1
1 1 2
2 0 3
0 1 2
1 2 1

*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i+1; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n-1-i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}