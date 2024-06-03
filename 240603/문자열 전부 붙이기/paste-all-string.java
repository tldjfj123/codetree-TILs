import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String res = "";
        for (int i = 0; i < n; i++) {
            res += sc.next();
        }

        System.out.print(res);
    }
}