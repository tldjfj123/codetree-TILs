import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char[] arr = s.toCharArray();

        char a = arr[0];
        char b = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == b) {
                arr[i] = a;
            }
        }

        System.out.print(new String(arr));
    }
}