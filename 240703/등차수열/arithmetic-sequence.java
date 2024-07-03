import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            arr[i] = v;
        }

        if (n < 2) {
            System.out.println(0);
            return;
        }

        Arrays.sort(arr);

        // System.out.println(Arrays.toString(arr));

        /*
        1. 숫자가 앞에 붙는 경우
        2. 숫자가 가운데 붙는 경우
        3. 숫자가 끝에 붙는 경우
        */

        int res = 0;
        for (int t = 1; t <= 100; t++) {
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if (Math.abs(t - arr[i]) == Math.abs(t - arr[j])) {
                        cnt++;
                    }
                }
            }  
            res = Math.max(res, cnt);
        }

        System.out.println(res);
    }
}