import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String res = s.substring(0, 1) + "a" + s.substring(2, s.length()-2) + "a" + s.substring(s.length()-1, s.length());

        System.out.print(res);
    }
}