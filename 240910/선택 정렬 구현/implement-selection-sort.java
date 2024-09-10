import java.util.*;

public class Main {
    static void swap(int[] arr, int i, int j) {
        if (arr[i] > arr[j]) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int min = i;

            for (int j = i+1; j < n; j++) {
                if (arr[min] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }

    }
}