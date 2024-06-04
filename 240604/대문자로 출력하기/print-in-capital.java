import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.next().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (65 <= (int)arr[i] && (int)arr[i] <= 90) {
                System.out.print(arr[i]);
            } else if (97 <= (int)arr[i] && (int)arr[i] <= 122) {
                System.out.print((char)(arr[i]-32));
            }
        }
    }
}