import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int a = sc.nextInt();

        while (a <= b) {
            if (b % 2 == 0) {
                System.out.print(b + " ");
            }
            b--;
        }
    }
}