import java.util.*;

public class Main {
    static int n;
    static int[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); 
        arr = new int[n][n];

        int m = sc.nextInt(); // 연속해야 하는 숫자의 수

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        if (n == 1) {
            System.out.println(2 * n);
        } else {
            int cnt = 0;
            // 가로
            for (int i = 0; i < n; i++) { //가로
                Stack<Integer> stack = new Stack<Integer>();
                for (int j = 0; j < n; j++) { // 세로
                    if (stack.isEmpty()) {
                        stack.push(arr[i][j]);
                    } else {
                        if (stack.peek() != arr[i][j]) {
                            stack.pop();
                        }
                        stack.push(arr[i][j]);
                    }
                }

                if (stack.size() >= m) {
                    cnt++;
                }
            }

            // 세로
            for (int j = 0; j < n; j++) { //세로
                Stack<Integer> stack = new Stack<Integer>();
                for (int i = 0; i < n; i++) { // 가로
                    if (stack.isEmpty()) {
                        stack.push(arr[i][j]);
                    } else {
                        if (stack.peek() != arr[i][j]) {
                            stack.pop();
                        }
                        stack.push(arr[i][j]); 
                    }
                }

                if (stack.size() >= m) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}