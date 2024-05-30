import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];
        int idx = 0;

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();

            if (n % 2 == 0) {
                arr[idx] = n;
                idx++;
            }
        }

        for (int i = idx - 1; i > -1; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}