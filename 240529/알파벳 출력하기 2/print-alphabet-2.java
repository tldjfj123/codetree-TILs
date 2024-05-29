import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char c = 'A';

        for (int i = 0; i < N; i++) {
            //공백
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            //문자
            for (int k = 0; k < N - i; k++) {
                if (c > 'Z') {
                    c = 'A';
                }
                System.out.print(c + " ");
                c++;
            }

            System.out.println();
        }
    }
}