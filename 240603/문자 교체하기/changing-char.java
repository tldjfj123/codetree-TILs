import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        String res = s1.substring(0, 2) + s2.substring(2, s2.length());

        System.out.print(res);
    }
}