import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];

        for (int i = 0; i < 10; i++) {
            String s = sc.next();

            arr[i] = s;
        }

        System.out.print(arr[1] + " " + arr[4] +  " " + arr[7]);
    }
}