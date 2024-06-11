import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        int curr = 0;
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            String order = sc.next();

            if (order.equals("R")) {
                arr[i] = new int[] {curr, curr + value};
                curr += value;
            } else {
                arr[i] = new int[] {curr - value, curr};
                curr -= value;
            }
        }

        //offset 할지말지 정하기
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][1] > max) {
                max = arr[i][1];
            }

            if (arr[i][0] < min) {
                min = arr[i][0];
            }
        }

        int[] res;

        if (min < 0) {
            res = new int[max - min+1];
        } else {
            res = new int[max];
        }

        int offset = min * -1;

        for (int i = 0; i < n; i++) {
            int start = arr[i][0] + offset;
            int end = arr[i][1] + offset;
            for (int j = start; j < end; j++) {
                res[j]++;
            }
        }

        int cnt = 0;

        for (int i = 0; i < res.length; i++) {
            if (res[i] >= 2) {
                cnt++;
            }
        }

        System.out.print(cnt);
        

        

    


    }
}