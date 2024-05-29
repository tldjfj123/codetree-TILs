import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int start = 11;

        for (int i = 0; i < n; i++) {
            int tmp = start;
            for (int j = 0; j < n; j++) {
                System.out.print(tmp + " ");
                tmp += 2;
            }
            start += 2;
            System.out.println();
        }
    }
}