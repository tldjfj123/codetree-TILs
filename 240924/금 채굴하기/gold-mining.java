import java.util.*;

public class Main {
    static int n; // 배열 크기
    static int m; // 금 1개 가격
    static int[][] arr;

    // 좌표가 배열 범위 안에 있는지 확인하는 함수
    static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    // (x, y)를 중심으로 마름모 모양으로 금을 채굴할 때, 손해를 보지 않고 채굴 가능한 최대 금 개수를 반환하는 함수
    static int mineGold(int x, int y) {
        int maxGold = 0;

        // 가능한 K 값을 증가시키며 탐색
        for (int K = 0; K <= n; K++) {
            int goldCount = 0;
            // 마름모 모양 안에 있는 금의 개수를 계산
            for (int i = 0; i <= K; i++) {
                for (int j = -i; j <= i; j++) {
                    // 위쪽 마름모 부분
                    if (inRange(x - i, y + j)) {
                        goldCount += arr[x - i][y + j];
                    }
                    // 아래쪽 마름모 부분
                    if (i != 0 && inRange(x + i, y + j)) {
                        goldCount += arr[x + i][y + j];
                    }
                }
            }

            // 채굴 비용 계산 (K * K + (K + 1) * (K + 1))
            int cost = K * K + (K + 1) * (K + 1);

            // 채굴 비용이 손해를 보지 않으면, 최대 금 개수 갱신
            if (goldCount * m >= cost) {
                maxGold = Math.max(maxGold, goldCount);
            } else {
                // 더 큰 K에서는 손해가 발생할 수 있으므로 탐색 중단
                break;
            }
        }

        return maxGold;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 배열 크기
        m = sc.nextInt(); // 금 1개 가격

        arr = new int[n][n]; // 금 위치 정보

        // 배열 입력 받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxGold = 0;

        // 모든 좌표를 중심으로 마름모 탐색
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // (i, j) 좌표를 중심으로 채굴할 수 있는 금 개수 탐색
                maxGold = Math.max(maxGold, mineGold(i, j));
            }
        }

        System.out.println(maxGold); // 최대 금 개수 출력
    }
}