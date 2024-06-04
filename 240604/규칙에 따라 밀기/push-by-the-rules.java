import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int len = s.length();
        char[] order = sc.next().toCharArray();

        for (int i = 0; i < order.length; i++) {
            if (order[i] == 'L') {
                s = s.substring(1, len) + s.substring(0, 1);
            } else {
                s = s.substring(len-1, len) + s.substring(0, len-1);
            }
        }

        System.out.print(s);
    }
}