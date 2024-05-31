import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            arr[i] = n;
        }

        while (arr.length >= 1) {
            int maxVal = -1;
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= maxVal) {
                    maxVal = arr[i];
                }
            }

            int idx = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == maxVal) {
                    idx = i;
                    break;
                }
            }
            
            System.out.print(idx+1 + " ");

            arr = Arrays.copyOfRange(arr, 0, idx);
        }

        
        
    }
}