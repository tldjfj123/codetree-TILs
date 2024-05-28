import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // 앞부분에 공백 추가
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            // 별과 별 사이에 공백을 추가하며 별 출력
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}