import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String target = sc.next();

        while (s.indexOf(target) != -1) {
            int length = target.length();
            s = s.substring(0, s.indexOf(target)) + s.substring(s.indexOf(target) + length);
        }

        System.out.println(s);
    }
}