import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // 시작
        int B = sc.nextInt(); // 끝
        int x = sc.nextInt(); // 텔포
        int y = sc.nextInt(); // 텔포

        //타는 경우
        int a = 0;
        if (Math.abs(A - x) < Math.abs(B - x)) {
            a = Math.abs(A - x) + Math.abs(B - y);
        } else {
            a = Math.abs(B - x) + Math.abs(A - y);
        }

        int b = Math.abs(B - A);

        System.out.println(Math.min(a, b));

        /**
        - 탄다
        1. 텔포까지 가기 : A - x;
        2. 텔포 타기
        3. 텔포에서 목적지까지 B - y;

        - 안탄다
        B - A
        **/


    }
}