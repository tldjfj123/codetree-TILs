import java.util.*;

public class Main {
    static int n;
    static int[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); 
        arr = new int[n][n];

        int m = sc.nextInt(); // 연속해야 하는 숫자의 수

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        if (m == 1) {
            System.out.println(2 * n);
        } else {
            int cnt = 0;

            // 가로 방향 연속 숫자 체크
            for (int i = 0; i < n; i++) {
                int consecutive = 1; // 연속되는 숫자의 개수
                for (int j = 1; j < n; j++) {
                    if (arr[i][j] == arr[i][j - 1]) {
                        consecutive++;
                        if (consecutive == m) {
                            cnt++;
                            break; // m개의 연속된 숫자가 나오면 종료
                        }
                    } else {
                        consecutive = 1; // 연속이 끊기면 초기화
                    }
                }
            }

            // 세로 방향 연속 숫자 체크
            for (int j = 0; j < n; j++) {
                int consecutive = 1;
                for (int i = 1; i < n; i++) {
                    if (arr[i][j] == arr[i - 1][j]) {
                        consecutive++;
                        if (consecutive == m) {
                            cnt++;
                            break;
                        }
                    } else {
                        consecutive = 1;
                    }
                }
            }

            System.out.println(cnt);
        }
    }
}