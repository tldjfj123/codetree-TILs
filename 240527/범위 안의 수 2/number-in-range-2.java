import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if (0 <= n && n <= 200) {
                cnt++;
                sum += n;
            }
        }

        double avg = sum / (double)cnt;
        
        System.out.print(sum + " ");
        System.out.printf("%.1f", avg);
    }
}