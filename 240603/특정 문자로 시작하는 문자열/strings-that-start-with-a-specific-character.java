import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        char std = sc.next().charAt(0);
        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) == std) {
                cnt++;
                sum += arr[i].length();
            }
        }

        double avg = sum / (double)cnt;

        System.out.printf(cnt + " " + "%.2f", avg);
    }
}