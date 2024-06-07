import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(calcSum(n));
    }

    static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }

        return calcSum(n-1) + n;

    }




}