import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 수열의 길이 입력
        int[] sums = new int[N - 1];  // 인접한 원소의 합을 저장할 배열

        // 인접한 원소의 합을 입력받음
        for (int i = 0; i < N - 1; i++) {
            sums[i] = sc.nextInt();
        }

        // 가능한 첫 번째 숫자를 1부터 N까지 시도
        for (int start = 1; start <= N; start++) {
            int[] sequence = new int[N];  // 현재 시도 중인 수열
            boolean[] used = new boolean[N + 1];  // 숫자의 사용 여부를 체크하는 배열
            sequence[0] = start;  // 첫 번째 숫자 설정
            used[start] = true;  // 첫 번째 숫자를 사용했음을 표시
            boolean valid = true;  // 현재 수열이 유효한지 여부

            // 다음 숫자들을 순차적으로 결정
            for (int i = 1; i < N; i++) {
                int next = sums[i - 1] - sequence[i - 1];  // 현재 숫자와 인접한 숫자의 합을 이용해 다음 숫자를 결정
                if (next < 1 || next > N || used[next]) {  // 다음 숫자가 유효하지 않은 경우
                    valid = false;
                    break;
                }
                sequence[i] = next;  // 다음 숫자를 수열에 저장
                used[next] = true;  // 다음 숫자를 사용했음을 표시
            }

            // 현재 수열이 유효한 경우 결과를 출력하고 종료
            if (valid) {
                for (int num : sequence) {
                    System.out.print(num + " ");
                }
                return;  // 결과를 찾았으므로 종료
            }
        }
    }
}