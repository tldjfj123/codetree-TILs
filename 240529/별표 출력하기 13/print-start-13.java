import java.util.*;

/*
0 4
2 3
4 2
6 1

1 1
3 2
5 3
7 4
*/


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int even = n;
        int odd = 1;


        for (int i = 0; i < 2*n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < even; j++) {
                    System.out.print("* ");
                }
                even--;
            } else {
                for (int k = 0; k < odd; k++) {
                    System.out.print("* ");
                }
                odd++;
            }
            System.out.println();
        }


    }
}