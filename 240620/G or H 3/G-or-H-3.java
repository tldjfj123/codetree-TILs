import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int k = sc.nextInt();  // 사진의 크기

        String[] arr = new String[10001];

        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            String s = sc.next();

            arr[v] = s;
        }

        // System.out.println(Arrays.toString(arr));

        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n-k+1; i++) {
            int tmp = 0;
            for (int j = i; j < i+k; j++) {
                if (arr[j] != null && arr[j].equals("G")) {
                    tmp += 2;
                } else if(arr[j] != null && arr[j].equals("H")) {
                    tmp += 1;
                }
            }
            max = Math.max(max, tmp);
        }

        System.out.println(max);

    }
}