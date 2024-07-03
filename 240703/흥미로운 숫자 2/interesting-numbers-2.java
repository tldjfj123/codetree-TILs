import java.util.*;

public class Main {
    public static int calc(int x) {
        String s = String.valueOf(x);
        char[] arr = s.toCharArray();

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                int v = map.get(arr[i]);
                map.put(arr[i], v+1);
            }
        }
        

        if (map.keySet().size() == 2 && map.containsValue(1)) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int res = 0;
        for (int i = X; i <= Y; i++) {
            res += calc(i);
        }

        System.out.println(res);
    }
}