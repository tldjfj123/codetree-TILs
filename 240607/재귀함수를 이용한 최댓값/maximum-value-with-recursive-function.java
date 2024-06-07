import java.util.*;

public class Main {
    static int[] arr;
    static int max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        max = Integer.MIN_VALUE;

        calc(n);

        System.out.print(max);
    }

    static int calc(int n) {
        if (n == 0) {
            return 1;
        }

        if (arr[n-1] > max) {
            max = arr[n-1];
        }

        return calc(n-1);
    }

    
}