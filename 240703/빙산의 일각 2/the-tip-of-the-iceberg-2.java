import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        int min = 100;
        int max = 1;

        for (int i = 0; i < N; i++) {
            int v = sc.nextInt();
            arr[i] = v;

            min = Math.min(min, v);
            max = Math.max(max, v);
        }

        int res = 0;
        for (int i = min; i <= max; i++) {
            int cnt = 0;
            int[] check = new int[N];

            //침수여부 확인
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > i) { // 침수X
                  check[j] = 1;  
                } 
            }

            Queue<Integer> tmp = new LinkedList<Integer>();

            for (int j = 0; j < check.length; j++) {
                if (tmp.isEmpty()) {
                    if (check[j] == 1) { // 침수안됨
                        tmp.offer(check[j]);
                    }
                } else {
                    if (check[j] == 0) {
                        cnt++;
                        tmp.clear();
                    } else {
                        tmp.offer(arr[j]);
                    }
                }
            }

            if (!tmp.isEmpty()) {
                cnt++;
            }

            res = Math.max(res, cnt);

        }

        System.out.println(res);

    }
}