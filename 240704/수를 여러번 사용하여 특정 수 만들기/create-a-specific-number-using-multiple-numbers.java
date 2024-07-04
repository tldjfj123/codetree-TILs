import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // A와 B를 0번이상 더해서 만들 수 있는 C이하 최댓값
        int aLimit = c / a;
        int bLimit = c / b;
        
        int res = 1;
        for (int i = 0; i <= aLimit; i++) {
            for (int j = 0; j <= bLimit; j++) {
                int calc = a * i + b * j;
                if (calc <= c) {
                    res = Math.max(res, calc);
                }
                
            }
        }
        System.out.println(res);
    }
}