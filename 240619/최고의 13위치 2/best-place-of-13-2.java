import java.util.*;

public class Main {
    static int N;
    static int[][] arr;

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < N;
    }

    // 주어진 시작 위치에서 1x3 격자 내의 1의 개수를 세는 함수
    public static int countOnes(int startX, int startY) {
        int count = 0;
        for (int j = startY; j < startY + 3; j++) {
            if (inRange(startX, j) && arr[startX][j] == 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N][N];

        // 입력 배열 초기화
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxOnes = 0;

        // 모든 위치에서 겹치지 않는 두 개의 1x3 격자의 1의 개수의 최댓값 구하기
        for (int i1 = 0; i1 < N; i1++) {
            for (int j1 = 0; j1 <= N - 3; j1++) {
                // 첫 번째 격자 (i1, j1)에 대한 1의 개수 계산
                int onesCount1 = countOnes(i1, j1);

                for (int i2 = 0; i2 < N; i2++) {
                    for (int j2 = 0; j2 <= N - 3; j2++) {
                        // 두 번째 격자 (i2, j2)에 대한 1의 개수 계산
                        if (i2 != i1 || j2 > j1 + 2 || j2 + 2 < j1) { // 겹치지 않는 조건
                            int onesCount2 = countOnes(i2, j2);
                            int totalOnes = onesCount1 + onesCount2;
                            if (totalOnes > maxOnes) {
                                maxOnes = totalOnes;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(maxOnes);
    }
}