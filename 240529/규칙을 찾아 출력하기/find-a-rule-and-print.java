import java.util.*;
/*
00 01 02 03
10       13
20 21    23 
30 31 32 33


00 01 02 03 04 05 
10             15
20 21          25 
30 31 32       35 
40 41 42 43    45
50 51 52 53 54 55


*/


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1 || j == 0 || j == n-1) {
                    System.out.print("* ");
                } else if (i > j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}