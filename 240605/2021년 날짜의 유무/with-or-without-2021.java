import java.util.*;


/*
31일 : 1, 3, 5, 7, 8, 10, 12
30일 : 4, 6, 9, 11
28일 : 2
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int D = sc.nextInt();

        System.out.println(calc(M, D));
    }

    static String calc(int m, int d) {
        if (m == 2) {
            if (1 <= d && d <= 28) {
                return "Yes";
            }
            return "No";
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (1 <= d && d <= 30) {
                return "Yes";
            }
            return "No";
        } else {
            if (1 <= d && d <= 31) {
                return "Yes";
            }
            return "No";
        }


    }
}