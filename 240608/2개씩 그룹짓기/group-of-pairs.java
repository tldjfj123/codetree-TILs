import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < 2 * n; i++) {
            arr.add(sc.nextInt());
        }

        // 정렬
        Collections.sort(arr);

        int maxSum = 0;

        // 그룹 페어링 및 최댓값 계산
        for (int i = 0; i < n; i++) {
            int sum = arr.get(i) + arr.get(2 * n - 1 - i);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println(maxSum);
    }
}