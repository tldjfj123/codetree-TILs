import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];

        for (int i = 0; i < 10; i++) {
            String c = sc.next();

            arr[i] = c;
        }

        for (int i = 9; i > -1; i--) {
            System.out.print(arr[i]);
        }
    }
}