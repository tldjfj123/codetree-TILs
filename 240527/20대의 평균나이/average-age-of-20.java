import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;

        while(true) {
            int n = sc.nextInt();

            if (n >= 30 || n < 20) {
                break;
            }
            
            cnt++;
            sum += n ;
        }

        double avg = sum / (double)cnt;

        System.out.printf("%.2f", avg);
    }
}