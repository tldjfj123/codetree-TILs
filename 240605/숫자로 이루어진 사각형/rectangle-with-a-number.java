import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        printSquare(N);
    }

    public static void printSquare(int n ) {
        int v = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (v > 9) {
                    v = 1;
                }
                System.out.print(v + " ");
                v++;
            }
            System.out.println();
        }
    }
}