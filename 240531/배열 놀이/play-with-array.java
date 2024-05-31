import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();

            arr[i] = input;
        }

        //질문부
        for (int i = 0; i < q; i++) {
            int order = sc.nextInt();

            if (order == 1) {
                int a = sc.nextInt();

                System.out.println(arr[a-1]);

            } else if (order == 2) {
                int b = sc.nextInt();
                int res = 0;

                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == b) {
                        res = j+1;
                        break;
                    }
                }
                
                System.out.println(res);

            } else {
                int s = sc.nextInt();
                int e = sc.nextInt();

                for (int j = s; j <= e; j++) {
                    System.out.print(arr[j-1] + " ");
                }
                System.out.println();

            }
        }
    }
}