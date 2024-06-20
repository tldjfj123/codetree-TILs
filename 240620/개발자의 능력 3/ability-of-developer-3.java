import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];

        int sum = 0;
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = i+1; j < 6; j++) {
                for (int k = j+1; k < 6; k++) {
                    int v = arr[i] + arr[j] + arr[k];
                    int tmp = sum - v;

                    min = Math.min(Math.abs(v - tmp), min);

                }
            }
        }

        System.out.println(min);
    }
}