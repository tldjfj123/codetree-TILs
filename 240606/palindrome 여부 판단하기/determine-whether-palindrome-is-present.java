import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        check(s);
    }

    static void check(String s) {
        char[] arr = s.toCharArray();

        char[] tmp = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            tmp[i] = arr[s.length()-1-i];
        }

        if (new String(tmp).equals(s)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}