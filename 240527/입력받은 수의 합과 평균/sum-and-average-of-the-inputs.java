import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int N = sc.nextInt();

            cnt++;
            sum += N;
        }

        double avg = sum / (double)cnt;

        System.out.print(sum + " ");
        System.out.printf("%.1f", avg);

    }
}