import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();

        char[] arr  = s.toCharArray();

        Arrays.sort(arr);

        for (char c : arr) {
            System.out.print(c);
        }

    }
}