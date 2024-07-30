import java.util.*;

public class Main {
    public static int minTotalDistance(int n, int[] A, int[] B) {
        int[] delta = new int[n];
        for (int i = 0; i < n; i++) {
            delta[i] = A[i] - B[i];
        }

        int prefixSum = 0;
        int totalDistance = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += delta[i];
            totalDistance += Math.abs(prefixSum);
        }

        return totalDistance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력
        int n = scanner.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            B[i] = scanner.nextInt();
        }

        // 결과 계산 및 출력
        int result = minTotalDistance(n, A, B);
        System.out.println(result);

        scanner.close();
    }
}