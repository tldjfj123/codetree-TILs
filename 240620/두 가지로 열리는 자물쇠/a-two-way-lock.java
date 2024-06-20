import java.util.*;

/*
조건 1 : 모든 자리에 대해 첫번째 조합과 거리가 2 이내
조건 2 : 모든 자리에 대해 두번째 조합과 거리가 2 이내
*/

public class Main {
    static int N;
    public static boolean calc(int x, int y) {
        int res = Math.min(Math.abs(x-y), N - Math.abs(x-y));

        if (res <= 2) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        
        N = sc.nextInt();
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();

        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    if ((calc(i, a1) && calc(j, b1) && calc(k, c1)) || (calc(i, a2) && calc(j, b2) && calc(k, c2))) {
                        cnt++;
                    }
                }
            }
        }
        
        System.out.println(cnt);

    }
}