import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.next();
        }

        char std = sc.next().charAt(0);

        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i].length()-1;

            if (arr[i].charAt(idx) == std) {
                System.out.println(arr[i]);
            }
        }

        if (cnt == 0) {
            System.out.print("None");
        }
    }
}