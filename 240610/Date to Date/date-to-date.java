import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numOfDays = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int sum1 = d1;
        int sum2 = d2;

        for (int i = 0; i <= m1; i++) {
            sum1 += numOfDays[i];
        }

        for (int i = 0; i <= m2; i++) {
            sum2 += numOfDays[i];
        }

        System.out.print(sum2 - sum1);

    }
}