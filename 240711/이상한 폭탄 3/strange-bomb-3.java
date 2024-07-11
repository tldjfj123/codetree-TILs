import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt(); // 폭탄 길이

        int[] arr = new int[N];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) { // 확인할 폭탄 고르기
            int left = Math.max(0, i - K);
            int right = Math.min(N - 1, i + K);
            int boom = arr[i]; // 현재 폭탄 번호

            if (boom == 0) continue; // 이미 터진 폭탄은 건너뜀

            // 범위 안에 같은 폭탄이 있는지 확인
            boolean check = false;
            for (int j = left; j <= right; j++) {
                if (arr[j] == boom && i != j) {
                    check = true;
                    break;
                }
            }

            // 같은 폭탄이 있는 경우 범위 내 모든 같은 폭탄 제거
            if (check) {
                for (int j = left; j <= right; j++) {
                    if (arr[j] == boom) {
                        arr[j] = 0;
                        map.put(boom, map.getOrDefault(boom, 0) + 1);
                    }
                }
            }
        }

        // 가장 많이 터진 폭탄의 번호 찾기
        int maxBoom = 0;
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int boom = entry.getKey();
            int count = entry.getValue();
            if (count > maxCount || (count == maxCount && boom > maxBoom)) {
                maxCount = count;
                maxBoom = boom;
            }
        }

        // Map이 비어있을 경우 0 출력
        if (map.isEmpty()) {
            maxBoom = 0;
        }

        System.out.println(maxBoom);
    }
}