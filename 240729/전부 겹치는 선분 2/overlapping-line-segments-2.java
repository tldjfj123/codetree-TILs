import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        // 배열 선언 및 값 입력
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            arr[i] = new int[] {x1, x2};
        }  

        boolean flag = false;
        for (int i = 0; i < n; i++) { // 패스할 배열
            int maxX1 = Integer.MIN_VALUE;
            int minX2 = Integer.MAX_VALUE;
            
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }

                maxX1 = Math.max(maxX1, arr[j][0]);
                minX2 = Math.min(minX2, arr[j][1]);
            }

            if (maxX1 <= minX2) {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}