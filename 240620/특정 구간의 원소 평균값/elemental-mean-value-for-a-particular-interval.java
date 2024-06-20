import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }  

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int cnt = 0;
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    cnt++;
                    sum += arr[k];
                }

                double avg = sum / (double)cnt;

                for (int k = i; k <= j; k++) {
                    if (arr[k] == avg) {
                        res++;
                        break;
                    }
                }
            }
        }
        System.out.println(res);
    }
}