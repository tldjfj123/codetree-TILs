import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        if (getSum(n) % 5 == 0 && Integer.parseInt(n) % 2 == 0) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    static int getSum(String n) {
        char[] arr = n.toCharArray();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] - '0';
        }

        return sum;
    }
}