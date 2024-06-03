import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.next().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = '0';
            }
        }

        for (int i = arr.length-1; i > -1; i--) {
            if (arr[i] != '0') {
                System.out.print(arr[i]);
            }
        }
    }
}