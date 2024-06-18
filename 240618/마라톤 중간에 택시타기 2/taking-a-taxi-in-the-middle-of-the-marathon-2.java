import java.util.*;

public class Main {
    public static int calc(int x1, int y1, int x2, int y2) {
        return (int)(Math.abs(x1 - x2) + Math.abs(y1 - y2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            arr[i] = new int[]{x, y};
        }

        int min = Integer.MAX_VALUE;

        for (int i = 1; i < N - 1; i++) { // 첫 번째와 마지막 점은 제외
            int totalDistance = 0;

            // i번째 점을 제외하고 거리 계산
            for (int j = 0; j < N - 1; j++) {
                if (j == i - 1) {
                    // i번째 점을 건너 뛰고 그 다음 점과의 거리 계산
                    totalDistance += calc(arr[j][0], arr[j][1], arr[j + 2][0], arr[j + 2][1]);
                } else if (j != i && j + 1 != i) {
                    // 일반적인 두 점 사이의 거리 계산
                    totalDistance += calc(arr[j][0], arr[j][1], arr[j + 1][0], arr[j + 1][1]);
                }
            }

            // i번째 점을 제외한 거리 출력
            min = Math.min(min, totalDistance);
        }

        System.out.println(min);
    }
}