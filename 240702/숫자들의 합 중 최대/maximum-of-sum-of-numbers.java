import java.util.*;

public class Main {
    public static int calc(int x) {
        int res = 0;

        while (x != 0) {
            res += x % 10;
            x /= 10;
        }

        return res;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int res = 0;
        for (int i = X; i <= Y; i++) {
            res = Math.max(res, calc(i));
        }

        System.out.println(res);
    }
}