import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] tmp = new int[n];
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            arr[i] = v;
            tmp[i] = v;
        }

        Arrays.sort(tmp);

        for (int i = 0; i < n; i++) { // 원래 배열
            for (int j = 0; j < n; j++) { // 기준 배열 (정렬됨)
                if (arr[i] == tmp[j]) {
                    System.out.print((j+1) + " ");
                    tmp[j] = 0;
                    break;
                }
            }       
        }
    }
}