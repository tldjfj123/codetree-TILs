import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            int status = sc.nextInt();

            if (!map.containsKey(num)) {
                map.put(num, status);
            } else {
                if (map.get(num) != status) {
                    map.put(num, status);
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}