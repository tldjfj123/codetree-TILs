import java.util.*;


/*
0 : 4 0 0 4
1 : 3 1 1 3
2 : 2 2 2 2 
3 : 1 3 3 1

*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // 별
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            //공백
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            //공백
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            //별
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}