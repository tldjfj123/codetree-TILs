import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        if (max - min <= k) {
            System.out.println(0);
            return;
        }

        int target = (max + min) / 2;
        int cost = 0;

        for (int i = 0; i < n; i++) {
            cost += Math.abs(arr[i] - target);
        }

        System.out.println(cost);
    }
}