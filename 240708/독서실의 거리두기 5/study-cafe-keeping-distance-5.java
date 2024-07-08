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

            List<Integer> calc = new ArrayList<Integer>();
            for (int j = 0; j < N; j++) {
                if (arrCopy[j] == 1) {
                    calc.add(j);
                }
            }

            Integer[] calcNum = calc.toArray(new Integer[0]); // Integer 배열로 변환
            
            if (calcNum.length < 3) {
                continue; // 연속된 3개의 1이 없다면 넘어가기
            }

            int tmpV = Integer.MAX_VALUE; // tmpV를 최대값으로 초기화
            for (int j = 0; j < calcNum.length - 2; j++) { // 내부 루프 인덱스 j 사용
                int left = calcNum[j];
                int mid = calcNum[j+1];
                int right = calcNum[j+2];

                tmpV = Math.min(tmpV, Math.min(mid - left, right - mid));
            }

            res = Math.max(tmpV, res);
        }

        System.out.println(res);
    }
}