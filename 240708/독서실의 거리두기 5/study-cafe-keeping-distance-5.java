import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String s = sc.next();
        char[] tmp = s.toCharArray();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = tmp[i] - '0';
        }
        
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) { // 자리 고르기
            if (arr[i] == 1) { // 자리 있으면 넘어가기
                continue;
            }
        
            int[] arrCopy = Arrays.copyOf(arr, arr.length);
            arrCopy[i] = 1;

            List<Integer> calc = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                if (arrCopy[j] == 1) {
                    calc.add(j);
                }
            }

            if (calc.size() < 2) {
                continue; // 연속된 2개의 1이 없다면 넘어가기
            }

            // 최소 거리 찾기
            int tmpV = Integer.MAX_VALUE; // 최대 값으로 초기화
            for (int j = 0; j < calc.size() - 1; j++) {
                int distance = calc.get(j + 1) - calc.get(j);
                tmpV = Math.min(tmpV, distance);
            }

            res = Math.max(tmpV, res);
        }

        System.out.println(res);
    }
}