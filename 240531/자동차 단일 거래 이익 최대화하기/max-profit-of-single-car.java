import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxVal = 0;
    
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[j] - arr[i] > maxVal) {
                    maxVal = arr[j] - arr[i];
                }            
            }
        }

        System.out.print(maxVal);


    }
}