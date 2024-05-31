import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] check = new int[1001];

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            check[n]++;
        }

        int maxVal = Integer.MIN_VALUE;
        for (int i = 1; i < 1001; i++) {
            if (i >= maxVal && check[i] == 1) {
                maxVal = i;
            }
        }

        System.out.print(maxVal);


    }
}