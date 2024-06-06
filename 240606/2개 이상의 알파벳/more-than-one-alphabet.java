import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.print(check(s));
    }

    static String check(String s) {
        if (s.length() == 1) {
            return "No";
        }

        char[] arr = s.toCharArray();

        for (int i = 1; i < arr.length; i++) {
            if (arr[0] != arr[i]) {
                return "Yes";
            }
        }

        return "No"; 
    }
}