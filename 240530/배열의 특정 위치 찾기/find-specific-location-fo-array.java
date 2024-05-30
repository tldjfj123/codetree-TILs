import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            arr[i] = n;
        }

        int res1 = 0;

        for (int i = 1; i < arr.length; i+=2) {
            res1 += arr[i];
        }

        int sum = 0;
        int cnt = 0;

        for (int i = 2; i < arr.length; i += 3) {
            sum += arr[i];
            cnt++;
        }

        double res2 = sum / (double)cnt;

        System.out.print(res1 + " " + res2);
    }
}