import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        int res = s.indexOf(t);

        if (res == -1) {
            System.out.print("No");
        } else {
            System.out.print(res);
        }

    }
}