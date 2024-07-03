import java.util.*;

public class Main {
    public static int calc(int x) {
        String s = String.valueOf(x);
        char[] arr = s.toCharArray();

        boolean isOk = true;

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                isOk = false;
            }
        }

        if (isOk) {
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