import java.util.*;

public class Main {
    public static int[] arr;
    public static int sum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        calc(arr, m);
    }

    static void calc(int[] arr, int m) {
        while (m != 0) {
            sum += arr[m-1];

            if (m % 2 == 1) {
                m -= 1;
            } else {
                m /= 2;
            }
        }

        System.out.print(sum);
    }
}