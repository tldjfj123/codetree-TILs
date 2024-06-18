import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] arr = s.toCharArray();

        int cnt = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length-1; j++) {
                if (arr[i] == '(' && arr[i+1] == '(' && arr[j] == ')' && arr[j+1] == ')') {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}