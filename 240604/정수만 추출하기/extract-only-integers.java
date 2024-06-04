import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        StringBuilder sb = new StringBuilder();
        int sum = 0;

        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();

        for (int i = 0; i < arrA.length; i++) {
            if ('0' <= arrA[i] && arrA[i] <= '9') {
                sb.append(arrA[i]);
            } else {
                break;
            }
        }
        
        sum += Integer.parseInt(sb.toString());

        sb = new StringBuilder();

        for (int i = 0; i < arrB.length; i++) {
            if ('0' <= arrB[i] && arrB[i] <= '9') {
                sb.append(arrB[i]);
            } else {
                break;
            }
        }

        sum += Integer.parseInt(sb.toString());


        System.out.print(sum);

        
    }
}