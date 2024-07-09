import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // n이하의 숫자
        int m = sc.nextInt(); // 갯수

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a > b) {
                int tmp = a;
                a = b;
                b = tmp;
            }

            String s = String.valueOf(a) + "," + String.valueOf(b);

            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                int v = map.get(s);
                map.put(s, v+1);
            }
        }
        
        int res = Integer.MIN_VALUE;
        for (String key : map.keySet()) {
            res = Math.max(res, map.get(key));
        }

        System.out.println(res);

    }
}