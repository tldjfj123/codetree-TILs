import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a / b + ".");

        a %= b;

        int cnt = 0;

        while (cnt < 20) {
            if (a < b) {
                System.out.print((a * 10) / b);
                a = (a * 10) % b;
            } else {
                System.out.print(a / b);
                a = a % b;
            }
            cnt++;
        }


    }
}