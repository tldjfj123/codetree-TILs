import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String res = "";

        while (true) {
            String s = sc.next();

            if (s.equals("0")) {
                break;
            }

            res += (s + " ");
        }

        String[] arr = res.split(" ");

        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

    }
}