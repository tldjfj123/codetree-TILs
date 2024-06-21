import java.util.*;

/*
111 ~ 999까지 돌면서
일치 여부를 확인한다
*/

class Test {
    int x;
    int cnt1;
    int cnt2;

    public Test (int x, int cnt1, int cnt2) {
        this.x = x;
        this.cnt1 = cnt1;
        this.cnt2 = cnt2;
    }
}

public class Main {
    public static int calc1(int x, int y) { //x : 정답 y : 문제, 스트라이크 확인
        int res = 0;
        
        int hundredsX = x / 100;        // 백의 자리
        int tensX = (x / 10) % 10;      // 십의 자리
        int unitsX = x % 10;            // 일의 자리

        int hundredsY = y / 100;        // 백의 자리
        int tensY = (y / 10) % 10;      // 십의 자리
        int unitsY = y % 10;            // 일의 자리

        if (hundredsX == hundredsY) {
            res++;
        }

        if (tensX == tensY) {
            res++;
        }

        if (unitsX == unitsY) {
            res++;
        }

        return res;
    }

    public static int calc2(int x, int y) { // 볼 확인 (정해진 자리 말고 다른 위치에 있을 떄)
        int res = 0;

        int hundredsX = x / 100;        // 백의 자리
        int tensX = (x / 10) % 10;      // 십의 자리
        int unitsX = x % 10;            // 일의 자리

        int hundredsY = y / 100;        // 백의 자리
        int tensY = (y / 10) % 10;      // 십의 자리
        int unitsY = y % 10;            // 일의 자리

        if ((hundredsX != hundredsY) && ((hundredsX == tensY) || (hundredsX == unitsY))) {
            res++;
        }

        if ((tensX != tensY) && ((tensX == hundredsY) || (tensX == unitsY))) {
            res++;
        }

        if ((unitsX != unitsY) && ((unitsX == hundredsY) || (unitsX == tensY))) {
            res++;
        }

        return res;
    }
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[889];

        for (int i = 111; i <= 999; i++) {
            arr[i-111] = i;
        }

        Test[] tests = new Test[N];
        for (int i = 0; i < N; i++) {
            tests[i] = new Test(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isOk = true;
            for (Test t : tests) {
                int tmp1 = calc1(t.x, arr[i]);
                int tmp2 = calc2(t.x, arr[i]);

                if (tmp1 != t.cnt1) {
                    isOk = false;
                    continue;
                }

                if (tmp2 != t.cnt2) {
                    isOk = false;
                    continue;
                }
            }

            if (isOk) {
                res++;
            }
        }
        System.out.println(res);
    }
}