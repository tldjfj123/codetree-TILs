import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char t = sc.next().charAt(0);

        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (t == s.charAt(i)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}