import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }
            arr[i] = n;
            cnt++;
        }

        int sum = 0;
        for (int i = 0; i < cnt; i++) {
            sum += arr[i];
        }

        double avg = sum / (double)cnt;

        System.out.print(sum + " ");
        System.out.printf("%.1f", avg);
    }
}