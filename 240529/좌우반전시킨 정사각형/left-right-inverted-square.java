import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n * i; j >= i; j -= i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}