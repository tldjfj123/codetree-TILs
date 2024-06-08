import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < 2*n; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);

        List<Integer> sub = arr.subList(2, n+1);

        int res = 0;

        for (Integer s : sub) {
            res += s;
        }

        res = Math.max(res + arr.get(0), res + arr.get(1));

        System.out.print(res);
    }
}