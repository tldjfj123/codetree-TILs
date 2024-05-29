import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();

        int[] arr = new int[4];
        int v = 2;

        for (int i = 0; i < arr.length; i++){
            arr[i] = v;
            v += 2;
        }

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[cnt %= 4] + " ");
                cnt++;
            }
            System.out.println();
        }
    }
}