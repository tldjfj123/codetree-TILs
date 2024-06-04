import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int q = sc.nextInt();
        int len = s.length();

        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();

            if (type == 1) {
                s = s.substring(1, len) + s.substring(0, 1);
            } else if (type == 2) {
                s = s.substring(len-1, len) + s.substring(0, len-1);
            } else {
                StringBuilder sb = new StringBuilder(s);
                s = sb.reverse().toString();
            }
            System.out.println(s);
        }
    }
}