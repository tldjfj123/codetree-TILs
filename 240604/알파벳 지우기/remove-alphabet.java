import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arrA = sc.next().toCharArray();
        char[] arrB = sc.next().toCharArray();
        int sum = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arrA.length; i++) {
            if ('0' <= arrA[i] && arrA[i] <= '9') {
                sb.append(arrA[i]);
            }
        }

        sum += Integer.parseInt(sb.toString());

        sb = new StringBuilder();

        for (int i = 0; i < arrB.length; i++) {
            if ('0' <= arrB[i] && arrB[i] <= '9') {
                sb.append(arrB[i]);
            }
        }

        sum += Integer.parseInt(sb.toString());

        System.out.print(sum);
    }
}