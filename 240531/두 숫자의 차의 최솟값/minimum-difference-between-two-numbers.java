import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minVal = 99;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int calc = (int)Math.abs(arr[j] - arr[i]); 
                if (calc < minVal) {
                    minVal = calc;
                }
            }
        }

        System.out.print(minVal);
    }
}