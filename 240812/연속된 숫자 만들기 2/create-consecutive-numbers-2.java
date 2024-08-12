import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int cnt = 0;

        while (true) {
            // 위치를 정렬하지 않고, 각 위치 간의 간격을 계산합니다.
            int gap1 = Math.abs(b - a);
            int gap2 = Math.abs(c - b);

            // 이미 연속된 경우 종료
            if (gap1 == 1 && gap2 == 1) {
                System.out.println(cnt);
                break;
            }

            // 가장 큰 간격을 좁히는 방법을 선택합니다.
            if (gap1 > gap2) {
                // a와 b 사이의 간격이 더 크다면 a를 이동
                a = b + 1;
            } else {
                // b와 c 사이의 간격이 더 크다면 c를 이동
                c = b - 1;
            }

            cnt++;
        }
    }
}