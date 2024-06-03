import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        
        int cnt = 0;
        for (int i = 0; i < s1.length()-1; i++) {
            if (s1.charAt(i) == s2.charAt(0) && s1.charAt(i+1) == s2.charAt(1)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}