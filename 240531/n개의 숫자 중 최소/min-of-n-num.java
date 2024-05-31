import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            int n =sc.nextInt();

            arr[i] = n;
        }

        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        int maxCnt = 0;
        int minCnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= maxVal) {
                maxVal = arr[i];
            }

            if (arr[i] <= minVal) {
                minVal = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxVal) {
                maxCnt++;
            }

            if (arr[i] == minVal) {
                minCnt++;
            }
        }

        System.out.print(minVal + " " + minCnt);
    }
}