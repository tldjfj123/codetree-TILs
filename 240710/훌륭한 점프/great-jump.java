import java.util.*;

public class Main {
    static int n, k;
    static int[] arr;

    public static boolean isPossible(int maxVal) {
        List<Integer> tmp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] <= maxVal) {
                tmp.add(i);
            }
        }

        if (tmp.size() == 0 || tmp.get(0) != 0 || tmp.get(tmp.size() - 1) != n - 1) {
            return false;
        }

        for (int i = 1; i < tmp.size(); i++) {
            int d = tmp.get(i) - tmp.get(i - 1);
            if (d > k) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = 0;

        // 범위는 1부터 배열의 최대 값까지입니다.
        int maxValue = Arrays.stream(arr).max().getAsInt();
        for (int i = 1; i <= maxValue; i++) {
            if (isPossible(i)) {
                System.out.println(i);
                return;
            }
        }
    }
}