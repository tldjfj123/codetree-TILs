import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.next().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int v = (int)arr[i];

            if (65 <= v && v <= 90) {
                System.out.print((char)(arr[i]+32));
            } else if ((97 <= v && v <= 122) || 48 <= v && v <= 57) {
                System.out.print(arr[i]);
            }
        }
    }
}