import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int n = sc.nextInt();

        // a 진법 n -> 10진수 n
        // 10진수 n -> b진법 n

        int idx = 0;
        int tmp = 0;

        List<Integer> arr = new ArrayList<Integer>();
        while (n != 0) {
            arr.add(n % 10);
            n /= 10;
        }

        for (int i = arr.size()-1; i > -1; i--) {
            tmp += (int)Math.pow(8, i) * arr.get(i);
        }

        List<Integer> arr2 = new ArrayList<Integer>();

        while (tmp != 0) {
            arr2.add(tmp % b);
            tmp /= b;
        }

        for (int i = arr2.size()-1; i > -1; i--) {
            System.out.print(arr2.get(i));
        }
        
    }
}