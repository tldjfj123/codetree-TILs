import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        String r1 = s1 + s2;
        String r2 = s2 + s1;

        if (r1.equals(r2)) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}