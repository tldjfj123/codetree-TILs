import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        char[] arr = sc.next().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] - '0';
        }

        System.out.print(sum);
    }
}