import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int cnt = 1;
        int max = a.length();
        int res = -1;

        while (cnt != max) {
            a = a.substring(a.length()-1, a.length()) + a.substring(0, a.length()-1);

            if (a.equals(b)) {
                res = cnt;
                break;
            } else {
                cnt++;
            }
        }

        System.out.print(res);
    }
}