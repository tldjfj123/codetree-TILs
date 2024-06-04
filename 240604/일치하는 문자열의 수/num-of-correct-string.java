import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String std = sc.next();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String v = sc.next();

            if (v.equals(std)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}