import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                sum += Character.getNumericValue(s.charAt(i));
            }
        }

        System.out.print(sum);
    }
}