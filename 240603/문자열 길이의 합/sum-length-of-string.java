import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            if (s.charAt(0) == 'a') {
                cnt++;
            }

            sum += s.length();

        }

        System.out.print(sum + " " + cnt);
    }
}