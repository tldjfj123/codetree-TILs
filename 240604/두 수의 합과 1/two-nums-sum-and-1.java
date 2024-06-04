import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        char[] arr = Integer.toString(sum).toCharArray();
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                cnt++;
            }
        }

        System.out.print(cnt);

        
    }
}