import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i < 6 * n; i += n) {
            System.out.print(i + " ");
        }
    }
}