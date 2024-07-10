import java.util.*;

public class Main {
    static int n, k;
    static int[] arr;

    public static boolean isPossible(int maxVal) {
        List<Integer> tmp = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            if (arr[i] <= maxVal) {
                tmp.add(i);
            }
        }

        int[] res = new int[tmp.size()];

        for (int i = 0; i < tmp.size(); i++) {
            res[i] = tmp.get(i);
        }

        // System.out.println(Arrays.toString(res));

        if (res[0] != 0 || res[res.length-1] != n-1) {
            return false;
        }

        for (int i = 1; i < res.length; i++) {
            int d = res[i] - res[i-1];

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

        for (int i = 1; i <= n; i++) { // 최솟값
            if (isPossible(i)) {
                System.out.println(i);
                return;
            }

        }
        
    }
}