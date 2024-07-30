import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arrB[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = 0; i < n-1; i++) {
            int gap = Math.abs(arrB[i] - arrA[i]);
            cnt += gap;
            arrA[i] += gap;
        }

        System.out.println(cnt);
    }
}