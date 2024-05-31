import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();

            if (n == 2) {
                cnt++;
            }

            if (cnt == 3) {
                System.out.print(i+1);
                break;
            }


        }


    }
}