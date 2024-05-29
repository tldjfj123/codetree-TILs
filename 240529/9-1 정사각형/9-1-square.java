import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[9];
        int v = 9;

        for (int i = 0; i < 9; i++) {
            arr[i] = v;
            v--;
        }

        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[idx %= 9]);
                idx++;
            }
            System.out.println();
        }
    }
}